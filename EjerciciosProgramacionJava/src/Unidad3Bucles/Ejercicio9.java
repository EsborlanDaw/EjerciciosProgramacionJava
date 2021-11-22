package Unidad3Bucles;


import java.util.Scanner;

/*
 * Proyecto UD3EjercicioBueclesGamma - Archivo Ejercicio9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 27 oct. 2021 16:49:55
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        
        Scanner cout = new Scanner(System.in);
        
        System.out.println("Introduce entero: ");
        int x = cout.nextInt();
        
       
        for(int i=0;i<x;i++){
            for(int k=x; k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<= i ;j++){
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
    }

}
