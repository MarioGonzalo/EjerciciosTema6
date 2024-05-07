package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un mapa para almacenar los números en texto como clave y su valor correspondiente como valor
        Map<String, Integer> numeros = new HashMap<>();

        // Agregar los números al mapa con su correspondiente nombre en texto
        numeros.put("cero", 0);
        numeros.put("uno", 1);
        numeros.put("dos", 2);
        numeros.put("tres", 3);
        numeros.put("cuatro", 4);
        numeros.put("cinco", 5);
        numeros.put("seis", 6);
        numeros.put("siete", 7);
        numeros.put("ocho", 8);
        numeros.put("nueve", 9);
        numeros.put("diez", 10);

        // Imprimir el mapa
        System.out.println("Mapa de números:");
        for (Map.Entry<String, Integer> entry : numeros.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
