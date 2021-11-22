/*
 * Proyecto EjercicioFunciones - Archivo Ejercicio21.java - Compañia DAW
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
 * @date 18 nov. 2021 20:35:17
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Ejercicio21 {
    
    public static int menu()
    {
        Scanner cin = new Scanner(System.in);
       
        System.out.println("Indica que quieres realizar: ");
        System.out.println("1.Circunferencia");
        System.out.println("2.Area");
        System.out.println("3.Volumen");
        System.out.println("0.Salir");
        int op = cin.nextInt();
       
        return op;
    }
   
    public static double pideRadio()
    {
         Scanner cin = new Scanner(System.in);
         
         System.out.println("Introduce el radio: ");
         int radio = cin.nextInt();
         
         return radio;
       
    }
   
    public static double calculaCircunferencia(double radio)
    {
        double circunferencia = (2 * Math.PI ) * radio;
       
        return circunferencia;
       
    }
   
    public static double calculaArea(double radio)
    {
        double area = Math.PI * (radio * radio);
       
        return area;
       
    }
   
    public static double calculaVolumen(double radio)
    {
        /*Preguntar como poner fracciones*/
        double volumen = (4/3) * Math.PI * (radio * radio * radio);
       
        return volumen;
       
    }
    public static void main(String[] args) {
       
        int op;
        do
        {
             op = menu();
           
            if (op!=0)
            {
                double radio = pideRadio();
                double circunferencia, area, volumen;
                switch(op)
                {
                    case 1:
                        circunferencia = calculaCircunferencia(radio);
                        System.out.println("La circunferencia es: " + circunferencia);
                        break;
                    case 2:
                        area = calculaArea(radio);
                        System.out.println("El area es: " + area);
                        break;
                    case 3:
                        volumen = calculaVolumen(radio);
                        System.out.println("El volumen es: " + volumen);
                }
            }
        } while(op!=0);
        
    }
}
