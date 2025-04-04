/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productebd.modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;

/**
 *
 * @author josem
 */
public class ProductoDAOImpl implements ProductoDAO {

    private final DataSource dataSource;

    public ProductoDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Producto> findAll() {
        final String sql = "SELECT * FROM producte";
        List<Producto> productos = new ArrayList<>();
        try (Connection conn = dataSource.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {            
            while(rs.next()){
                Long id = rs.getLong("id");
                String nombre =rs.getString("nombre");
                BigDecimal precio = rs.getBigDecimal("precio");
                LocalDate fecha = rs.getDate("fecha_creacion").toLocalDate();
                String descripcion = rs.getString("descripcion");
                productos.add(new Producto(id, nombre, precio, fecha, descripcion));
            }            
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener productos", e);
        }
        return productos;
    }

    @Override
    public Optional<Producto> findById(Long id) {
        final String sql = "SELECT * FROM producte WHERE id = ?";
        
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    return Optional.of(new Producto(
                            rs.getLong("id"),
                            rs.getString("nombre"),
                            rs.getBigDecimal("precio"),
                            rs.getDate("fecha_creacion").toLocalDate(),
                            rs.getString("descripcion")                    
                    ));
                }
            }
        } catch ( SQLException ex){
            System.out.println("Error al buscar producto por id" + ex);
        }
        
        return Optional.empty();
    }

    @Override
    public boolean insert(Producto producto) {
        final String sql = "INSERT INTO producte (nombre, precio, descripcion) VALUES (?, ?, ?)";
        
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, producto.nombre());
            stmt.setBigDecimal(2, producto.precio());
            if(producto.descripcion() == null){
                stmt.setNull(3,Types.VARCHAR);
            }else{
                stmt.setString(3,producto.descripcion());
            }
            return stmt.executeUpdate() != 0;            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar producto " + ex);
        }
        
        return false;
    }

    @Override
    public boolean update(Producto producto) {
        final String sql = "UPDATE producte SET nombre = ?, precio = ?, descripcion = ? WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, producto.nombre());
            stmt.setBigDecimal(2, producto.precio());
            if(producto.descripcion() == null){
                stmt.setNull(3,Types.VARCHAR);
            }else{
                stmt.setString(3,producto.descripcion());
            }
            stmt.setLong(4,producto.id());
            return stmt.executeUpdate() != 0;            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar producto " + ex);
        }
        
        return false;
    }

    @Override
    public boolean delete(Producto producto) {
        return deleteById(producto.id());
    }

    @Override
    public boolean deleteById(Long id) {
        final String sql = "DELETE FROM producte WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){            
         
            stmt.setLong(1,id);
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas != 0;            
            
        } catch (SQLException ex) {
            System.out.println("Error al modificar producto " + ex);
        }
        
        return false;
    }
}
