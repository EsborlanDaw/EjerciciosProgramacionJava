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
    
    public static void calcular(int select)
    {
        switch(select)
        {
            case 1:
                sumar();
             
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                calcularAreaRectangulo();
                break;
            case 6:
                calcularAreaTriangulo();
                break;
            case 7:
                calcularAreaCirculo();
                break;
            case 8:
                calculaSenoCosenoTangente();
                break;
        }
    }
    
    public static void sumar()
    {
        Scanner cin = new Scanner (System.in);
        double res;
       
        System.out.println("Introduce primer numero");
        double n = cin.nextDouble();
        System.out.println("Introduce segundo numero");
        double n1 = cin.nextDouble();
        res = n + n1;
       
        System.out.println("El resultado es: " + res);
       
   }
    
    public static void restar ()
    {
        Scanner cin = new Scanner (System.in);
        double res;
       
        System.out.println("Introduce primer numero");
        double n = cin.nextDouble();
        System.out.println("Introduce segundo numero");
        double n1 = cin.nextDouble();
        res = n - n1;
       
        System.out.println("El resultado es: " + res);
    }
    public static void multiplicar ()
    {
        Scanner cin = new Scanner (System.in);
        double res;
       
        System.out.println("Introduce primer numero");
        double n = cin.nextDouble();
        System.out.println("Introduce segundo numero");
        double n1 = cin.nextDouble();
        res = n * n1;
       
        System.out.println("El resultado es: " + res);
    }
    public static void dividir ()
    {
        Scanner cin = new Scanner (System.in);
        double res;
       
        System.out.println("Introduce primer numero");
        double n = cin.nextDouble();
        System.out.println("Introduce segundo numero");
        double n1 = cin.nextDouble();
        if(n1!=0)
        {
            res = n / n1;
            System.out.println("El resultado es: " + res);
        }
        else
            System.out.println("ERROR");
    }
    public static double calcularAreaRectangulo()
    {
        double base, altura, area;
        
        base = pedirNEnRango(0,1000000);
        altura = pedirNEnRango(0,1000000);
        
        area = base * altura;
        
        System.out.println("El area es: " + area);
        
        return area;
        
    }
    public static void calcularAreaTriangulo()
    {
        double area = calcularAreaRectangulo() / 2;
        
        System.out.println("El area es: " + area);
    }
    public static void calcularAreaCirculo()
    {
        double radio = pedirNEnRango(0,1000000);
        
        double area = Math.PI * (radio * radio);
        
        System.out.println("El area es: " + area);
    }
    public static void calculaSenoCosenoTangente()
    {
        double x = pedirNEnRango(-360,360);
        
        System.out.println("El seno es: " + Math.sin(x));
        System.out.println("El coseno es: " + Math.cos(x) );
        System.out.println("La tangente es: " + Math.tan(x));
    }
    public static double pedirNEnRango(int max, int min)
    {
        Scanner cin = new Scanner (System.in);
        double n;
        
        do
        {
            System.out.println("Introduce numeros entre: " + max + "," + min);
            n = cin.nextInt();
        }
        while(n>min && n<max);
        
        return n;
    }
    
    
    
    public static void main(String[] args) {
        
        int select;
        
        do
        {
            select = menu();
            calcular(select);
        }
        
        while(select!=9);
         
       
    }

}

