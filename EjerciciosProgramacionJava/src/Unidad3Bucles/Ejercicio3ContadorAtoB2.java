package Unidad3Bucles;


import java.util.Scanner;

public class Ejercicio3ContadorAtoB2 {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        System.out.println("Introduce primer valor: ");
        int a = cout.nextInt();
        System.out.println("Introduce primer valor: ");
        int b = cout.nextInt();

        System.out.println(a);

        do {
            a = a + 2;

            System.out.println(a);
        } while (a < b);
    }
}
