
import java.util.Scanner;

/*
 * Proyecto EjerciciosProgramacionJava - Archivo Practica0Calculadora.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 22 nov. 2021 20:27:48
 */
/**
 *
 * @author Estefania Boriko Laenos <esborlan.daw@gmail.com>
 */
public class Practica0Calculadora {
    
    public static int menu()
    {
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Elige una opcion: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Area de un rectangulo");
        System.out.println("6.Área de un triángulo equilátero");
        System.out.println("7.Área de un círculo");
        System.out.println("8.Seno, Coseno y Tangente ");
        
        int op = cin.nextInt();
        
        return op;
        
    }
    
    public static void calcular(int op)
    {
        
    }
    
    public static int pedirIntEnRango(int max, int min)
    {
        Scanner cin = new Scanner (System.in);
        
        System.out.println("Elige una opcion: ");
        int op = cin.nextInt();
        
        return op;
    }
    
    
    
    public static void main(String[] args) {
        
       
    }

}
