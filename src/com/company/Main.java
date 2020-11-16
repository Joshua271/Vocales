package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        char ingreso;
        ingreso = 'a';
        while(ingreso != 'c'){
            System.out.print("Ingrese una vocal cualquiera: ");
            ingreso = x.next().charAt(0);
            switch (ingreso) {
                case 'a', 'A' -> System.out.println("A");
                case 'e', 'E' -> System.out.println("E");
                case 'i', 'I' -> System.out.println("I");
                case 'o', 'O' -> System.out.println("O");
                case 'u', 'U' -> System.out.println("U");
                default -> ingreso = 'c';
            }
        }
    }
}
