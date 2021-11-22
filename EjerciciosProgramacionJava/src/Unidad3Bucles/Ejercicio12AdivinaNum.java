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
public class Ejercicio12AdivinaNum {

    public static void main(String[] args) {
        int centinela = 50;
        int min = 1;
        int max = 100;
        int n, n1;

        Scanner cout = new Scanner(System.in);

        do {
            System.out.println("Pulsa 1 si es igual, Pulsa 0 si no es correcto");
            System.out.println("El numero es: " + centinela);
            n = cout.nextInt();

            if (n == 0) {
                
                System.out.println("¿Es mayor o menor? 1.Mayor, 2.Menor");
                n1 = cout.nextInt();
                
                if(n1==1)
                {
                    min = centinela;
                    centinela = (min + max) / 2;
                }
                
                else
                {
                    max = centinela;
                    centinela = (min + max) / 2;
                }
          
                
            }

        } while (n != 1);
        
        
        System.out.println("He adivinado el numero: " + centinela);

    }

}
