/*
 * Proyecto EjercicioFunciones - Archivo EjercicioFunciones.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Unidad5Funciones;

import java.util.Scanner;

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio18 {

    public static char calculaLetraDni ( int ndni)
    {
        /*String  Letra;*/
        int res;
        char Letra;
        /*String [] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B"
                ,"N","J","Z","S","Q","V","H","L","C","K","E"};
        
        
        
        for(int i = res; i<res;i++)
        {
             Letra = letra[i];
             
             System.out.println(Letra);
        }*/
        
        res = ndni%23;
        
        switch(res)
        {
            case 1:
                    Letra = 'R';
                break;
            case 2:
                    Letra = 'W';
                break;
            case 3:
                    Letra = 'A';
                break;
            case 4:
                    Letra = 'G';
                break;
            case 5:
                    Letra = 'M';
                break;
            case 6:
                    Letra = 'Y';
                break;
            case 7:
                    Letra = 'F';
                break;
            case 8:
                    Letra = 'P';
                break;
            case 9:
                    Letra = 'D';
                break;
            case 10:
                    Letra = 'X';
                break;
            case 11:
                    Letra = 'B';
                break;
            case 12:
                    Letra = 'N';
                break;
            case 13:
                    Letra = 'J';
                break;
            case 14:
                    Letra = 'Z';
                break;
            case 15:
                    Letra = 'S';
                break;
            case 16:
                    Letra = 'Q';
                break;
            case 17:
                    Letra = 'V';
                break;
            case 18:
                    Letra = 'H';
                break;
            case 19:
                    Letra = 'L';
                break;
            case 20:
                    Letra = 'C';
                break;
            case 21:
                    Letra = 'K';
                break;
            case 22:
                    Letra = 'E';
                break;
                
            default:
                    Letra = 'T';
        }
        
        return Letra;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner cin = new Scanner ( System.in);
        
        
            System.out.println("Introduce numero dni: ");
            int dni = cin.nextInt();
            
            char l = calculaLetraDni(dni);
            
            System.out.println(dni + " " + l);
            
        
    }
    
}
