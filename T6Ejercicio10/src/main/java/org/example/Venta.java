package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Venta implements Comparable<Venta> {
    private String nombreProducto;
    private String nombreCliente;
    private double precio;
    private String fecha;

    public Venta(String nombreProducto, String nombreCliente, double precio, String fecha) {
        this.nombreProducto = nombreProducto;
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Venta otraVenta) {
        // Ordenar por fecha, nombre del cliente y precio de la transacción
        int comparacionFecha = this.fecha.compareTo(otraVenta.getFecha());
        if (comparacionFecha != 0) {
            return comparacionFecha;
        }
        int comparacionCliente = this.nombreCliente.compareTo(otraVenta.nombreCliente);
        if (comparacionCliente != 0) {
            return comparacionCliente;
        }
        return Double.compare(this.precio, otraVenta.precio);
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Cliente: " + nombreCliente + ", Producto: " + nombreProducto + ", Precio: $" + precio;
    }
}



