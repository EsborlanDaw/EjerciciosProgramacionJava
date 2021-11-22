package Unidad5Funciones;

import java.util.Scanner;

public class PracticaCalculadora {
    
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
        System.out.println("9.Salir ");
        
        int op = cin.nextInt();
        
        return op;
        
    }
    
    public static void calcular()
    {
        
        int select = menu();
        
        switch(select)
        {
            case 1:
                sumarRestarMultiplicar();
                break;
            case 2:
                sumarRestarMultiplicar();
                break;
            case 3:
                sumarRestarMultiplicar();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }
    
    public static void sumarRestarMultiplicar ()
    {
        Scanner cin = new Scanner (System.in);
        double res;
        int select = menu();
        System.out.println("Introduce primer numero");
        double n = cin.nextDouble();
        System.out.println("Introduce segundo numero");
        double n1 = cin.nextDouble();
        
        if(select == 1)
            res = n + n1;
        else if(select == 2)
            res = n - n1;
        else
            res = n * n1;
        
        System.out.println("El resultado es: " + res);
       
   }
    
    public static void dividir ()
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
        
       menu();
    }

}
