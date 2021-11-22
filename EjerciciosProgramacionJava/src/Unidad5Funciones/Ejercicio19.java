/*
 * Proyecto EjercicioFunciones - Archivo Ejercicio19.java - Compañia DAW
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
 * @date 18 nov. 2021 20:13:39
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio19 {
    
    public static boolean calculaFuncionPitagoras (int a, int b, int c)
    {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        boolean x = false;
        
        if ( a2 + b2 == c2)
        {
            x = true;
        }
        System.out.println( a2 + " + " + b2 + " = " + c2);
        
        return x;
    }
    public static void main(String[] args) {
        
        int x, y , z;
        boolean igual;
        
        Scanner cin = new Scanner ( System.in);
        
        System.out.println("Introduce valor x: ");
        x = cin.nextInt();
        System.out.println("Introduce valor y: ");
        y = cin.nextInt();
        System.out.println("Introduce valor z: ");
        z = cin.nextInt();
        
        igual = calculaFuncionPitagoras(x,y,z);
       
        
        if(igual == true)
        {
            System.out.println("Se cumple la funcion de Pitagoras.");
        }
        
        else
        {
            System.out.println("No se cumple la funcion de Pitagoras.");
        }
        
        
        
    }
}
