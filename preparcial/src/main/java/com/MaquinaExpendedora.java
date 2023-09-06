package com;

public class MaquinaExpendedora {
    private int valorPagar;
    private int valorPagado;

    public MaquinaExpendedora(int valorPagado, int valorPagar){
        assert valorPagado >= 0;
        assert valorPagar >= 0;
        assert valorPagado > valorPagar;
        this.valorPagado = valorPagado;
        this.valorPagar = valorPagar;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(int valorPagado) {
        this.valorPagado = valorPagado;
    }
    
}
