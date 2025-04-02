/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ut10_ejemplo;

/**
 *
 * @author ciclost
 */
public class Ut10_ejemplo {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Hello World!");
            } catch (ClassNotFoundException ex) {
            System.out.println("S'ha produït un error al no trobar eixe driver");
            }        
    }
}
