package org.example;

public class Main {
    public static void main(String[] args) {
        Pareja<Integer> par1 = new Pareja<>(1, 2);
        System.out.println(par1.getPrimero());
        System.out.println(par1.getSegundo());
    }
}