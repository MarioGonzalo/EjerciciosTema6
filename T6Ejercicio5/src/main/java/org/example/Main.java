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
            System.out.println("\n1. Introducir una cadena en una posición específica");
            System.out.println("2. Eliminar una cadena de la lista");
            System.out.println("3. Salir");
            System.out.println("4. Mostrar lista");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Introduzca la cadena: ");
                    String cadena = scanner.nextLine();
                    System.out.print("Introduzca la posición donde desea insertar la cadena: ");
                    int posicion = scanner.nextInt();
                    if (posicion >= 0 && posicion <= lista.size()) {
                        lista.add(posicion, cadena);
                        mostrarLista(lista);
                    } else {
                        System.out.println("La posición especificada no es válida. La cadena no ha sido insertada.");
                    }
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        System.out.print("Introduzca la posición de la cadena que desea eliminar: ");
                        int posicionEliminar = scanner.nextInt();
                        if (posicionEliminar >= 0 && posicionEliminar < lista.size()) {
                            lista.remove(posicionEliminar);
                            mostrarLista(lista);
                        } else {
                            System.out.println("La posición especificada no es válida. No se ha eliminado ninguna cadena.");
                        }
                    } else {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                case 4:
                    mostrarLista(lista);
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
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ". " + lista.get(i));
            }
        }
    }
}
