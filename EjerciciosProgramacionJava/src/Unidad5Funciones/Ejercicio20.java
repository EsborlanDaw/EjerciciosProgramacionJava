/*
 * Proyecto EjercicioFunciones - Archivo Ejercicio20.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Unidad5Funciones;

import java.util.Scanner;

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 18 nov. 2021 20:28:26
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio20 {

    public static void multiplica(int x) {
        int mult;

        System.out.println("LA TABLA DE : " + x);

        for (int i = 0; i < 11; i++) {
            mult = i * x;

            System.out.println(x + " x " + i + " = " + mult);
        }
    }

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n;

        System.out.println("Introduce entero: ");
        n = cin.nextInt();

        multiplica(n);

    }
}
