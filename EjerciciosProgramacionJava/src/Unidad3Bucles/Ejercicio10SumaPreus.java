package Unidad3Bucles;


import java.util.Scanner;

public class Ejercicio10SumaPreus {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);
        int precio = 0;
        int n;

        System.out.println("1.Calcular el valor de 5 precios. ");
        System.out.println("2.Calcular el valor de varios precios. ");
        int op = cout.nextInt();

        switch (op) {

            case 1:

                for (int i = 0; i < 5; i++) {
                    System.out.println("Introduce precio: ");
                    n = cout.nextInt();

                    precio = precio + n;
                }

                break;

            case 2:

                do {
                    System.out.println("Introduce un numero negativo para finalizar");
                    System.out.println("Introduce precio: ");
                    n = cout.nextInt();

                    if (n >= 0) {
                        precio = precio + n;
                    }

                } while (n >= 0);

        }

        System.out.println(precio);
    }
}
