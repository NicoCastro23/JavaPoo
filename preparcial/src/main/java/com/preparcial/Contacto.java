package com.preparcial;

public class Contacto {
    private String name;
    private String email;
    private String numeroContacto;
    public Contacto(String name, String email, String numeroContacto) {
        this.name = name;
        this.email = email;
        this.numeroContacto = numeroContacto;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    
}
