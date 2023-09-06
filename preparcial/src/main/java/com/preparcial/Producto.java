package com.preparcial;
import java.time.LocalDate;

public class Producto {
    private String name;
    private LocalDate fechaVencimiento;
    private int precio;
    public Marca marca;
    public TipoProducto tipoProducto;

    public Producto(String name, LocalDate fechaVencimiento, int precio, Marca marca, TipoProducto tipoProducto){
        assert name != null;
        assert fechaVencimiento != null;
        assert marca != null;
        assert tipoProducto != null;
        assert precio >= 0;
        
        this.name = name;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.marca = marca;
        this.tipoProducto = tipoProducto;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getPrecio() {
        return precio;
    }
    
    public Marca getMarca(){
        return marca;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
    
}

