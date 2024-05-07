package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear una lista utilizando ArrayList
        List<Pareja<Integer>> arrayList = new ArrayList<>();
        // Llenar la lista con 100 parejas de enteros aleatorios
        llenarLista(arrayList, 100);
        // Mostrar los valores de la lista
        System.out.println("Parejas en ArrayList:");
        mostrarLista(arrayList);

        // Crear una lista utilizando LinkedList
        List<Pareja<Integer>> linkedList = new LinkedList<>();
        // Llenar la lista con 100 parejas de enteros aleatorios
        llenarLista(linkedList, 100);
        // Mostrar los valores de la lista
        System.out.println("\nParejas en LinkedList:");
        mostrarLista(linkedList);
    }

    // Método para llenar una lista con parejas de enteros aleatorios
    private static void llenarLista(List<Pareja<Integer>> lista, int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            int primero = rand.nextInt(100); // Generar un entero aleatorio entre 0 y 99
            int segundo = rand.nextInt(100); // Generar otro entero aleatorio entre 0 y 99
            Pareja<Integer> pareja = new Pareja<>(primero, segundo);
            lista.add(pareja);
        }
    }

    // Método para mostrar las parejas de una lista
    private static void mostrarLista(List<Pareja<Integer>> lista) {
        for (Pareja<Integer> pareja : lista) {
            System.out.println("(" + pareja.getPrimero() + ", " + pareja.getSegundo() + ")");
        }
    }
}
