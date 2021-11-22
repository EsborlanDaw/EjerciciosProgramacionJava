package Unidad3Bucles;


import java.util.Scanner;

public class Ejercicio2ContadorAtoB {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        System.out.println("Introduce primer valor: ");
        int a = cout.nextInt();
        System.out.println("Introduce primer valor: ");
        int b = cout.nextInt();
        
        System.out.println(a);
        
        do {
            a++;

            System.out.println(a);
        } while (a < b);

    }

}
