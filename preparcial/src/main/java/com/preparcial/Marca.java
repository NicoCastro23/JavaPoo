package com.preparcial;

public class Marca {
    public String name;
    public String web;
    public String email;

    public Marca(String name, String web, String email){
        assert name != null;
        assert web != null;
        assert email != null;
        
        this.name = name;
        this.email = email;
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public String getWeb() {
        return web;
    }

    public String getEmail() {
        return email;
    }
    
}
