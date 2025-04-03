/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.mycompany.productosbd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author ciclost
 */
public record Producto(
        Long id,
        String nombre,
        BigDecimal precio,
        LocalDate fechaCreacion,
        String descripcion) {
    public Producto(String nombre, BigDecimal precio, String descripcion){
        this(null, nombre, precio, LocalDate.now(), descripcion);
    }
    
    public Producto withId(Long id){
        return new Producto(id, this.nombre, this.precio, this.fechaCreacion, this.descripcion);
    }
    
    
    
        

}
