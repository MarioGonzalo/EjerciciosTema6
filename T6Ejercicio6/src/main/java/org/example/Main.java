package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n1. Introducir una cadena");
            System.out.println("2. Eliminar una cadena");
            System.out.println("3. Mostrar la lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Introduzca la cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    Collections.sort(lista); // Ordenar la lista
                    mostrarLista(lista);
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        System.out.print("Introduzca la cadena que desea eliminar: ");
                        String cadenaEliminar = scanner.nextLine();
                        if (lista.contains(cadenaEliminar)) {
                            lista.remove(cadenaEliminar);
                            mostrarLista(lista);
                        } else {
                            System.out.println("La cadena especificada no existe en la lista. No se ha eliminado ninguna cadena.");
                        }
                    } else {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    }
                    break;
                case 3:
                    mostrarLista(lista);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (String cadena : lista) {
                System.out.println(cadena);
            }
        }
    }
}
