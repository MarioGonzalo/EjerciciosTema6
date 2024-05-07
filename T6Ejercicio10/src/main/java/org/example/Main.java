package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Venta> ventas = new TreeSet<>();

        System.out.println("Introduce los registros de ventas (nombre producto, nombre cliente, precio, fecha), o escribe 'fin' para terminar:");

        while (true) {
            System.out.print("Registro: ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split(",");
            if (partes.length != 4) {
                System.out.println("Formato incorrecto. Debe ser: nombre producto, nombre cliente, precio, fecha");
                continue;
            }

            String nombreProducto = partes[0].trim();
            String nombreCliente = partes[1].trim();
            double precio;
            try {
                precio = Double.parseDouble(partes[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el precio a número. Formato incorrecto.");
                continue;
            }
            String fecha = partes[3].trim();

            ventas.add(new Venta(nombreProducto, nombreCliente, precio, fecha));
        }

        System.out.println("\nRegistros de ventas ordenados:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }

        scanner.close();
    }
}