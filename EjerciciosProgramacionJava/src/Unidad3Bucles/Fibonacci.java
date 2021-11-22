package Unidad3Bucles;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a033567565p
 */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 1;
        int n1 = 1;
        int suma = 1;
        int cont = 0;

        do {
            suma = n + n1;

            System.out.println(suma);

            n = n1;
            n1 = suma;

            cont++;

        } while (cont <= 10);
    }

}
