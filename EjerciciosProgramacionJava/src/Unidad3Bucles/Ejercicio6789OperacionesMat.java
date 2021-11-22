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
public class Ejercicio6789OperacionesMat {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        int i = 0;
        int n;
        int m = 1;
        System.out.println("1.Suma de los numeros de A to B.");
        System.out.println("2.Multiplicacion de los numeros de A to B.");
        System.out.println("Indica que quieres realizar: ");
        int op = cout.nextInt();

        switch (op) {
            case 1:

                do {
                    System.out.println("Introduce numero: ");
                    n = cout.nextInt();
                    System.out.println("Pulsa 0 para salir del bucle.");

                    i = n + i;

                } while (n != 0);

                System.out.println(i);

                break;

            case 2:

                do {
                    System.out.println("Introduce numero: ");
                    n = cout.nextInt();
                    System.out.println("Pulsa 0 para salir del bucle.");

                    if (n != 0) {
                        m = n * m;
                    }

                } while (n != 0);

                System.out.println(m);

                break;

        }

    }
}
