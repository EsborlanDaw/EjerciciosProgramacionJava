package Unidad4EstructuraDeDatos;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Proyecto UD4EstructuraDeDatos - Archivo Ejercicio31.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 10 nov. 2021 21:05:20
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        
        Scanner cout = new Scanner (System.in);
        
        int [] vec = new int[1000];
        int cont = 0;
        
        for(int i = 0; i< vec.length; i++)
        {
            vec[i] = (int) (Math.random() * 100 );
            
            System.out.println(vec[i]);
        }
        
        Arrays.sort(vec);
        
        System.out.println( Arrays.toString(vec) );
        
        System.out.println("Qué número quieres buscar: ");
        int x = cout.nextInt();
        
            
            int pos = Arrays.binarySearch(vec, x);
            
            System.out.println("Se encuentra en la posicion = " + pos);
           
        
        
        System.out.println("El numero = " + x) ;
        
        
        
    }

}
