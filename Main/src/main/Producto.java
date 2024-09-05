/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Yamila
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre,double precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if(precio < 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no puede ser negativo");
        }
    }

    public void setCantidad(int cantidad) {
        if(cantidad < 0){
            this.cantidad = cantidad;
        }else{
            System.out.println("La cantidad debe ser mayor a 0");
            
        }
    }
    
    
    
}
