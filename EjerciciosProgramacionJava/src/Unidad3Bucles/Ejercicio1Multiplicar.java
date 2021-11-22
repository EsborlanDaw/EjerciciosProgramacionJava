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
public class Ejercicio1Multiplicar {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);
        int mult = 0;
        int res;
        

        System.out.println("Introduce un valor.");
        int n = cout.nextInt();

        do{
            res = n * mult;

            System.out.println( n + " * " + mult + " = " + res);
            
            mult++;
        }
        
        while(mult<=10);

    }
}
