/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productosbd.modelo;

/**
 *
 * @author ciclost
 */
public interface ProductoDAO {
    List<Producto< findAll();
    Optional<Producto>findByid(Long id);
    
}
