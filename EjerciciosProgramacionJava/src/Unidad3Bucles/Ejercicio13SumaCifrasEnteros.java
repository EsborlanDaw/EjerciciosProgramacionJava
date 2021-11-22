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
public class Ejercicio13SumaCifrasEnteros {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        int n;
        int suma = 0;
        int cont = 0;

        System.out.println("1.Introduce un entero: ");
        n = cout.nextInt();

        while (n > 0) {

            suma = suma + n % 10;
            n = n / 10;
            cont++;

        }

        System.out.println(suma);
        System.out.println("Numero de cifras: " + cont);

    }

}
