package Unidad4EstructuraDeDatos;


import java.util.Scanner;

/*
 * Proyecto UD4EstructuraDeDatos - Archivo Ejercicio14.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 10 nov. 2021 18:51:50
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner cout = new Scanner (System.in);
        
        double[] vec = new double[10];
        double max = vec[0];
        double min = vec[0];
        
        
        System.out.println("Introduce numero: ");
        
        for (int i = 0; i< vec.length; i++)
        {
             vec [i] = cout.nextDouble();
            
            
            if (vec[i] > max)
            {
                max = vec[i];
                
            }
            if (vec[i] < min)
            {
                min = vec[i];
            }
            
        }
        
        
        System.out.println("Maximo = " + max);
        System.out.println("Minimo = " + min);
        
    }

}
