package org.example;

public class Pareja<T> {
    private T primero;
    private T segundo;

    public Pareja(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }
}