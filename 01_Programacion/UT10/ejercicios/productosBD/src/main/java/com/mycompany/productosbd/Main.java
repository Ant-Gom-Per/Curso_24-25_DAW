/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.productosbd;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sql.DataSource;

/**
 *
 * @author ciclost
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static ProductoDAO productoDAO;

    public static void main(String[] args) {
        DataSource pool = configurarPool();
        productoDAO = new ProductoDAOImpl(pool);

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);

        scanner.close();
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
            case 1 ->
                listarProductos();
            case 2 ->
                buscarPorId();
            case 3 ->
                insertarProducto();
            case 4 ->
                actualizarProducto();
            case 5 ->
                eliminarProducto();
            case 6 ->
                System.out.println("Saliendo del sistema...");
            default ->
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    private static void listarProductos() {
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        productoDAO.findAll().forEach(System.out::println);
    }

    private static void buscarPorId() {
        System.out.print("\nIngrese ID del producto: ");
        long id = scanner.nextLong();
        productoDAO.findById(id).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Producto no encontrado")
        );
    }

    private static void insertarProducto() {
        try {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio: ");
            BigDecimal precio = scanner.nextBigDecimal();

            scanner.nextLine(); // Limpiar buffer
            System.out.print("Descripción (opcional): ");
            String descripcion = scanner.nextLine();

            Producto nuevo = new Producto(nombre, precio, descripcion);
            Producto insertado = productoDAO.insert(nuevo);
            System.out.println("Producto insertado con ID: " + insertado.id());
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    private static void actualizarProducto() {
        try {
            System.out.print("\nIngrese ID del producto a actualizar: ");
            long id = scanner.nextLong();

            Producto existente = productoDAO.findById(id)
                    .orElseThrow(() -> new Exception("Producto no encontrado"));

            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nuevo nombre (" + existente.nombre() + "): ");
            String nombre = scanner.nextLine();

            System.out.print("Nuevo precio (" + existente.precio() + "): ");
            BigDecimal precio = scanner.nextBigDecimal();

            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nueva descripción (" + existente.descripcion() + "): ");
            String descripcion = scanner.nextLine();

            Producto actualizado = new Producto(
                    id,
                    nombre.isEmpty() ? existente.nombre() : nombre,
                    precio,
                    existente.fechaCreacion(),
                    descripcion.isEmpty() ? existente.descripcion() : descripcion
            );

            productoDAO.update(actualizado);
            System.out.println("Producto actualizado correctamente");
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    private static void eliminarProducto() {
        System.out.print("\nIngrese ID del producto a eliminar: ");
        long id = scanner.nextLong();
        if (productoDAO.deleteById(id)) {
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el producto");
        }
    }

    private DataSource configurarPool() {
        DataSource pool = new DataSource();
        pool.setDriverClassName("oracle.jdbc.OracleDriver");
        pool.setUrl("jdbc:oracle:thin:@localhost:1521:ORCLCDB");
        pool.setUsername("javauser");
        pool.setPassword("javauser");
        pool.setInitialSize(5);
        pool.setMaxActive(10);
        pool.setMaxIdle(5);
        pool.setMinIdle(2);
        return pool;
    }

}
