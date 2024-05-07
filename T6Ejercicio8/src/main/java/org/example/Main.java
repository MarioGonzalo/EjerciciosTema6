package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Character> numeroLetraMapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n1. Introducir un par número/letra");
            System.out.println("2. Recuperar una letra a partir de su número correspondiente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca un número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Introduzca una letra: ");
                    char letra = scanner.next().charAt(0);
                    numeroLetraMapa.put(numero, letra);
                    System.out.println("Par número/letra añadido correctamente.");
                    break;
                case 2:
                    System.out.print("Introduzca el número del cual desea recuperar la letra: ");
                    int numeroBuscado = scanner.nextInt();
                    if (numeroLetraMapa.containsKey(numeroBuscado)) {
                        char letraCorrespondiente = numeroLetraMapa.get(numeroBuscado);
                        System.out.println("La letra correspondiente al número " + numeroBuscado + " es: " + letraCorrespondiente);
                    } else {
                        System.out.println("No se encontró ningún par número/letra para el número especificado.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}
