package Unidad2Condicionales;


/**
 *
 * @author a033567565p
 */

import java.util.Scanner;

public class CalculadoraInteractiva {

    public static void main(String[] args) {

        //Declaración para leer las entradas por teclado
        Scanner cout = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Calcular resto.");
            System.out.println("6. Exponencial");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Tangente");
            System.out.println("10. Salir");
            System.out.println("Indica que quieres realizar: ");
            op = cout.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Introduce numero: ");
                    double n = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n1 = cout.nextDouble();

                    double suma = n + n1;

                    System.out.println("La suma es de:" + suma);

                    break;

                case 2:

                    System.out.println("Introduce numero: ");
                    double n2 = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n3 = cout.nextDouble();

                    double resta = n2 - n3;

                    System.out.println("La resta es de: " + resta);

                    break;

                case 3:

                    System.out.println("Introduce numero: ");
                    double n4 = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n5 = cout.nextDouble();

                    double mult = n4 * n5;

                    System.out.println("La multiplicacion es de: " + mult);

                    break;

                case 4:

                    System.out.println("Introduce numero: ");
                    double n6 = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n7 = cout.nextDouble();

                    double div = n6 / n7;

                    System.out.println("La division es de: " + div);

                    break;

                case 5:

                    System.out.println("Introduce numero: ");
                    double n8 = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n9 = cout.nextDouble();

                    double res = n8 % n9;

                    System.out.println("El resto es de: " + res);

                    break;

                case 6:

                    System.out.println("Introduce numero: ");
                    double n10 = cout.nextDouble();
                    System.out.println("Introduce numero: ");
                    double n11 = cout.nextDouble();

                    System.out.println("El resto es de: " + (Math.pow(n10, n11)));

                    break;

                case 7:

                    System.out.println("Introduce el numero: ");
                    double n12 = cout.nextDouble();

                    System.out.println("El seno es de: " + (Math.sin(n12)));

                    break;

                case 8:

                    System.out.println("Introduce el numero: ");
                    double n13 = cout.nextDouble();

                    System.out.println("El coseno es de: " + (Math.cos(n13)));

                    break;

                case 9:

                    System.out.println("Introduce el numero: ");
                    double n14 = cout.nextDouble();

                    System.out.println("La tangente es de: " + (Math.sin(n14)) / (Math.cos(n14)));

                    break;

            }
        } while (op != 10);
    }
}
