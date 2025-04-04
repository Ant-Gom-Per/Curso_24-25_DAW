/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productebd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Producto(
    Long id,
    String nombre,
    BigDecimal precio,
    LocalDate fechaCreacion,
    String descripcion
) {
    // Constructor sin ID para inserciones
    public Producto(String nombre, BigDecimal precio, String descripcion) {
        this(null, nombre, precio, LocalDate.now(), descripcion);
    }
    
    public Producto withId(Long id) {
        return new Producto(id, this.nombre, this.precio, this.fechaCreacion, this.descripcion);
    }
}