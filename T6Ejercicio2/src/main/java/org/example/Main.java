package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear una lista utilizando ArrayList
        List<Double> arrayList = new ArrayList<>();
        // Llenar la lista con 100 valores aleatorios
        llenarLista(arrayList, 100);
        // Mostrar los valores de la lista
        System.out.println("Valores en ArrayList:");
        mostrarLista(arrayList);

        // Crear una lista utilizando LinkedList
        List<Double> linkedList = new LinkedList<>();
        // Llenar la lista con 100 valores aleatorios
        llenarLista(linkedList, 100);
        // Mostrar los valores de la lista
        System.out.println("\nValores en LinkedList:");
        mostrarLista(linkedList);
    }

    // Método para llenar una lista con valores aleatorios

    private static void llenarLista(List<Double> lista, int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add((double) rand.nextInt(100)); // Genera un número entero aleatorio entre 0 y 99
        }
    }

    // Método para mostrar los valores de una lista
    private static void mostrarLista(List<Double> lista) {
        for (Double valor : lista) {
            System.out.println(valor);
        }
    }
}
