/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ciclost
 */
public class productDAO {
    private static product lineToProduct(String line){
        String[] partes = line.split(",");
        int id = Integer.parseInt(partes[0].trim());
        String name = partes[1].trim();
        double price = Double.parseDouble(partes[2].trim());
        return new product(id,name,price);
}
    private static String productToLine(product p){
        return p.id() + "," + p.name() + "," + p.price();
    }
    
    public static ArrayList<product> getAll(){
        try(FileReader fr = new FileReader("src/datos/products.csv")){
            
        }
    }
}
