package com.preparcial;

public class Vehiculo{
    private String placa;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo, Contacto contacto) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public TipoVehiculo getVehiculo(){
        return tipoVehiculo;
    }
}