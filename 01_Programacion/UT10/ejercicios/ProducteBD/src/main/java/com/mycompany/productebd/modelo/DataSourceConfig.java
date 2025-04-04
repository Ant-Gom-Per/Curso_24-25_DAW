/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productebd.modelo;

import org.apache.tomcat.jdbc.pool.DataSource;

public class DataSourceConfig {
    public static DataSource configurarPool() {
        DataSource pool = new DataSource();
        pool.setDriverClassName("oracle.jdbc.OracleDriver");
        pool.setUrl("jdbc:oracle:thin:@10.116.0.147:1521:ORCLCDB");
        pool.setUsername("javauser");
        pool.setPassword("javauser");
        pool.setInitialSize(50);
        pool.setMaxActive(50);
        pool.setMaxIdle(5);
        pool.setMinIdle(2);
        return pool;
    }
}
