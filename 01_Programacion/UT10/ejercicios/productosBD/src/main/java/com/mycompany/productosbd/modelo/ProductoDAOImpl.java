/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productosbd.modelo;

import javax.sql.DataSource;

/**
 *
 * @author ciclost
 */
public abstract class ProductoDAOImpl implements ProductoDAO{
    private final DataSource datasource;

    public ProductoDAOImpl(DataSource datasource) {
        this.datasource = datasource;
    }
    
    
    
}
