package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Persona> personas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca los pares nombre/apellido de las personas (o 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            personas.add(new Persona(nombre, apellido));
        }

        System.out.println("\nPersonas ordenadas alfabéticamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        scanner.close();
    }
}