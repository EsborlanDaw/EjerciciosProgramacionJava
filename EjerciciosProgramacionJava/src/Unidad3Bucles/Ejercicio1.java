package Unidad3Bucles;


import java.util.Scanner;

/*
 * Proyecto UD3EjercicioBueclesGamma - Archivo Ejercicio1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 25 oct. 2021 20:01:55
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int a = 0;

        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {
                System.out.print(a);
                a++;
            }

            System.out.println(" ");
            a = 0;
        }

    }
}


