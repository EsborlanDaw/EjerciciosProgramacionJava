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
public class Ejercicio3PosNeg {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);
        int posit = 0;
        int negat = 0;
        int n;

        do {
            System.out.println("Introduce valor: ");
            n = cout.nextInt();

            if (n != 0) {
                if (n < 0) {
                    negat++;
                } else {
                    posit++;
                }
            }

        } while (n != 0);

        System.out.println("Negativos " + negat + " Positiovos: " + posit);
    }

}
