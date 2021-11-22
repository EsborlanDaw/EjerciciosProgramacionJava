package Unidad3Bucles;

/*
 * Proyecto UD3EjercicioBueclesGamma - Archivo Ejercicio8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 25 oct. 2021 21:37:25
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int mes = 1;
        do {

            switch (mes) {

                case 1:case 3:case 5:case 7:case 8:case 10:case 12:

                    for (int i = 1; i <= 31; i++) {
                        System.out.println(i + "/" + mes);

                    }

                    break;

                case 2:

                    for (int i = 1; i <= 28; i++) {
                        System.out.println(i + "/" + mes);

                    }
                    break;

                case 4:case 6:case 9:case 11:

                    for (int i = 1; i <= 30; i++) {
                        System.out.println(i + "/" + mes);
                    }

                    break;
            }

            mes++;

        } while (mes <= 12);

    }

}
