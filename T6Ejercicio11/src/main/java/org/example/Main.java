package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Leer todas las líneas del archivo de entrada
            List<String> lineas = leerLineas(inputFile);

            // Ordenar las líneas
            Collections.sort(lineas);

            // Escribir las líneas ordenadas en el archivo de salida
            escribirLineas(outputFile, lineas);

            System.out.println("El archivo ha sido ordenado y guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer/escribir el archivo: " + e.getMessage());
        }
    }

    private static List<String> leerLineas(String nombreArchivo) throws IOException {
        List<String> lineas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            lineas.add(linea);
        }
        reader.close();
        return lineas;
    }

    private static void escribirLineas(String nombreArchivo, List<String> lineas) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
        for (String linea : lineas) {
            writer.write(linea);
            writer.newLine();
        }
        writer.close();
    }
}
