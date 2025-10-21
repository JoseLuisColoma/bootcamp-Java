package com.jocodev.nba.model;

public class Equipo {
    private String nombre;
    private String abreviatura;
    private String ciudad;
    private String conferencia;
    private String division;

    public Equipo(String nombre, String abreviatura, String ciudad, String conferencia, String division) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.ciudad = ciudad;
        this.conferencia = conferencia;
        this.division = division;
    }

    public String getNombre() { return nombre; }
    public String getAbreviatura() { return abreviatura; }
    public String getCiudad() { return ciudad; }
    public String getConferencia() { return conferencia; }
    public String getDivision() { return division; }

    public void mostrarInfo() {
        System.out.printf("%-25s | %-10s | %-15s | %-10s | %-10s%n",
                nombre, abreviatura, ciudad, conferencia, division);
    }
}
