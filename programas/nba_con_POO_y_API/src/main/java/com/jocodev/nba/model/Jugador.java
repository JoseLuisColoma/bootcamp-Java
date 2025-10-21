package com.jocodev.nba.model;

public class Jugador {
    private String nombre;
    private String posicion;
    private String equipo;

    public Jugador(String nombre, String posicion, String equipo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNombre() { return nombre; }
    public String getPosicion() { return posicion; }
    public String getEquipo() { return equipo; }

    public void mostrarInfo() {
        System.out.printf("%-25s | %-10s | %s%n", nombre, posicion, equipo);
    }
}
