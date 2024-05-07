package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Comparar por apellido primero y luego por nombre si los apellidos son iguales
        int comparacionApellido = this.apellido.compareTo(otraPersona.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        return this.nombre.compareTo(otraPersona.getNombre());
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
}



