/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productebd;

import com.mycompany.productebd.modelo.DataSourceConfig;
import com.mycompany.productebd.modelo.Producto;
import com.mycompany.productebd.modelo.ProductoDAO;
import com.mycompany.productebd.modelo.ProductoDAOImpl;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.tomcat.jdbc.pool.DataSource;

/**
 *
 * @author josem
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DataSource pool = DataSourceConfig.configurarPool();
    private static final ProductoDAO productoDAO = new ProductoDAOImpl(pool);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ CRUD PRODUCTOS ===");
        System.out.println("1. Listar todos los productos");
        System.out.println("2. Buscar producto por ID");
        System.out.println("3. Insertar nuevo producto");
        System.out.println("4. Actualizar producto");
        System.out.println("5. Eliminar producto");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar buffer
            return -1;
        }
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> listarProductos();
            case 2 -> buscarPorId();
            case 3 -> insertarProducto();
            case 4 -> actualizarProducto();
            case 5 -> eliminarProducto();
            case 6 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    private static void listarProductos() {
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        var productos = productoDAO.findAll();
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");
            return;
        }
        
        System.out.println("ID | NOMBRE | PRECIO | FECHA | DESCRIPCIÓN");
        System.out.println("------------------------------------------");
        for (Producto p : productos) {
            System.out.printf("%d | %s | %.2f | %s | %s%n", 
                p.id(), p.nombre(), p.precio(), p.fechaCreacion(), 
                p.descripcion() != null ? p.descripcion() : "");
        }
    }

    private static void buscarPorId() {
        try {
            System.out.print("\nIngrese ID del producto: ");
            long id = scanner.nextLong();
            productoDAO.findById(id).ifPresentOrElse(
                p -> System.out.printf("Producto encontrado: %d | %s | %.2f | %s | %s%n", 
                    p.id(), p.nombre(), p.precio(), p.fechaCreacion(), 
                    p.descripcion() != null ? p.descripcion() : ""),
                () -> System.out.println("Producto no encontrado")
            );
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            scanner.nextLine(); // Limpiar buffer
        }
    }

    private static void insertarProducto() {
        try {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Precio: ");
            BigDecimal precio = new BigDecimal(scanner.nextLine());
            
            System.out.print("Descripción (opcional, presione Enter para omitir): ");
            String descripcion = scanner.nextLine();
            if (descripcion.isEmpty()) {
                descripcion = null;
            }

            Producto nuevo = new Producto(nombre, precio, descripcion);
            productoDAO.insert(nuevo);
            System.out.println("Producto insertado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
            scanner.nextLine(); // Limpiar buffer
        }
    }

    private static void actualizarProducto() {
        try {
            System.out.print("\nIngrese ID del producto a actualizar: ");
            long id = scanner.nextLong();
            
            var productoOptional = productoDAO.findById(id);
            if (productoOptional.isEmpty()) {
                System.out.println("Producto no encontrado");
                return;
            }
            
            Producto existente = productoOptional.get();
            scanner.nextLine(); // Limpiar buffer
            
            System.out.print("Nuevo nombre [" + existente.nombre() + "] (Enter para mantener): ");
            String nombre = scanner.nextLine();
            nombre = nombre.isEmpty() ? existente.nombre() : nombre;
            
            System.out.print("Nuevo precio [" + existente.precio() + "] (Enter para mantener): ");
            String precioStr = scanner.nextLine();
            BigDecimal precio = precioStr.isEmpty() ? existente.precio() : new BigDecimal(precioStr);
            
            System.out.print("Nueva descripción [" + (existente.descripcion() != null ? existente.descripcion() : "sin descripción") + "] (Enter para mantener): ");
            String descripcion = scanner.nextLine();
            if (descripcion.isEmpty()) {
                descripcion = existente.descripcion();
            } else if (descripcion.equalsIgnoreCase("null")) {
                descripcion = null;
            }

            Producto actualizado = new Producto(
                id,
                nombre,
                precio,
                existente.fechaCreacion(),
                descripcion
            );
            
            productoDAO.update(actualizado);
            System.out.println("Producto actualizado correctamente");
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            scanner.nextLine(); // Limpiar buffer
        }
    }

    private static void eliminarProducto() {
        try {
            System.out.print("\nIngrese ID del producto a eliminar: ");
            long id = scanner.nextLong();
            if (productoDAO.deleteById(id)) {
                System.out.println("Producto eliminado correctamente");
            } else {
                System.out.println("No se pudo eliminar el producto. Verifique que el ID existe.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            scanner.nextLine(); // Limpiar buffer
        }
    }
}