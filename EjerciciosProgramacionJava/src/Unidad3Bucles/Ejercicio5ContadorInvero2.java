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
public class Ejercicio5ContadorInvero2 {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        System.out.println("Introduce primer valor: ");
        int a = cout.nextInt();
        System.out.println("Introduce primer valor: ");
        int b = cout.nextInt();

        System.out.println(a);

        do {
            a = a - 2;

            System.out.println(a);

        } while (a > b);

    }
}
