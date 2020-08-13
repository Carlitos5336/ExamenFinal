package com.example.examenfinal;

public class Producto {
    int precio;
    int cantidad;
    String nombre;

    public Producto(int precio, int cantidad, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
