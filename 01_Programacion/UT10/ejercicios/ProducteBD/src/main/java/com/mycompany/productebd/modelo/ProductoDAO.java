/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productebd.modelo;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author josem
 */
public interface ProductoDAO {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    boolean insert(Producto producto);
    boolean update(Producto producto);
    boolean delete(Producto producto);
    boolean deleteById(Long id);
}