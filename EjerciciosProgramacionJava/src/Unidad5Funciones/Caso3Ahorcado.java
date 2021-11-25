/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad5Funciones;

import java.util.Scanner;

/**
 *
 * @author fani6
 */
public class Caso3Ahorcado {
     // Devuelve una palabra aleatoria
    public static String damePalabraAleatoria ()
    {
        String [] palabAhorcado = {"LUNES","TRIATLON","PIANO","GUITARRA","PIZARRA",
        "VENTANA","ORDENADOR","COCHE","ENSAIMADA","COSTILLAR", "MOVIL", "TECLADO","MONITOR",
        "PROYECTO","RETRATO","REPORTERO","HORIZONTE","CUENTO","CARRETERA","ACCIDENTE","PERSIANA",
        "AMBULANCIA","HOSPITAL","POLICIA","NUMEROS","EDIFICIO","BOTELLA","ALCANTARILLA",
        "TIGRE","LEOPARDO","ELEFANTE","SERPIENTE","TORTUGA","RETRATO","AYUNTAMIENTO",
        "MONO","LAGARTIJA","ESTABLO","FURGONETA","MADRID","VALENCIA","LUXEMBURGO",
        "PAMPLONA","IBIZA","TERRITORIO","REPRESENTANTE","TOLEDO","ITALIA","RUSIA",
        "ALEMANIA"};
       
        int random = (int)(Math.random() * 50 + 1);
       
        return palabAhorcado[random];
    }
    
    public static char pedirLetra()
    {
        Scanner cin = new Scanner (System.in);
        
        System.out.println("Introduce letra: ");
        char letra = cin.next().charAt(0);
        
        return letra;
        
    }
    
    public static int comprobarVidas(int max)
    {
        int vida = max;
        
        return vida;
    }
    
    public static boolean comprobarRespuesta(char letra, String palabra)
    {
        boolean correcto = false;
        
        return correcto;
    }
    
    public static void mostrarPalabra()
    {
        String palabra = damePalabraAleatoria();
        
        for(int i = 0; i<palabra.length(); i++)
        {
            System.out.print("-");
        }
    }
    public static void main(String[] args) {
       
    }
}
