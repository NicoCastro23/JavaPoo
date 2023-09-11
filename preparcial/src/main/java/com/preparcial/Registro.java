package com.preparcial;
import java.text.BreakIterator;
import java.time.LocalDateTime;

public class Registro {
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Vehiculo vehiculo;
    private TipoLavado tipoLavado;

    public Registro(LocalDateTime horaEntrada, LocalDateTime horaSalida, TipoLavado tipoLavado, Vehiculo vehiculo) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.tipoLavado = tipoLavado;
    }


    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public TipoLavado getTipoLavado() {
        return tipoLavado;
    }


    public void setTipoLavado(TipoLavado tipoLavado) {
        this.tipoLavado = tipoLavado;
    }


    public int getPrecio(){
        int valor= 0;
        TipoVehiculo tipoVehiculo = vehiculo.getVehiculo();
        switch(tipoVehiculo){
            case CARRO:
            
                switch(tipoLavado){
                    case SIMPLE:
                        valor = 3500;
                        break;

                    case DELUX:
                        valor = 300;
                        break;
                    case POLICHADO:
                        valor = 222;
                        break;
                    }
                break;
            case MOTO:
            
                switch(tipoLavado){
                    case SIMPLE:
                        valor = 3500;
                        break;

                    case DELUX:
                        valor = 300;
                        break;
                    case POLICHADO:
                        valor = 222;
                        break;
                    }
                break;

            case CAMIONETA:
            
                switch(tipoLavado){
                    case SIMPLE:
                        valor = 3500;
                        break;

                    case DELUX:
                        valor = 300;
                        break;
                    case POLICHADO:
                        valor = 222;
                        break;
                    }
                break;
        }
        return valor;
        
    }
}
