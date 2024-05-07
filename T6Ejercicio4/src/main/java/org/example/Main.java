package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n1. Introducir una cadena");
            System.out.println("2. Eliminar el último dato introducido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Introduzca una cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    mostrarLista(lista);
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        lista.remove(lista.size() - 1);
                        mostrarLista(lista);
                    } else {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    }
                    break;
                case 3:
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
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        }
    }
}
// He usado la lista de arraylist porque es más eficiente en cuanto a la búsqueda de elementos y la inserción de elementos en la lista.