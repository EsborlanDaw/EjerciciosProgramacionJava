package Unidad2Condicionales;


/**
 *
 * @author a033567565p
 */
import java.util.Scanner;

public class CentroMedico {

    public static void main(String[] args) {
        
       
        //Declaración para leer las entradas por teclado
        Scanner cout = new Scanner(System.in);
        int riesgo = 5;
        int parterial, colesterol, diabetes, obesidad, tabaquismo, inactividad;
        int sexo, corazon, mayor;
        double friesgo;
        int factores = 0;

        System.out.println("Indique cual de estos factores tiene, siendo 1 Sí "
                + "y 2 No: ");
        System.out.println("Presion arterial alta: ");
        parterial = cout.nextInt();

        if (parterial == 1) {
            riesgo = riesgo + 15;

            factores++;
        }

        System.out.println("Colesterol elevado:");
        colesterol = cout.nextInt();

        if (colesterol == 1) {
            riesgo = riesgo + 15;

            factores++;
        }
        System.out.println("Diabetes: ");
        diabetes = cout.nextInt();

        if (diabetes == 1) {
            riesgo = riesgo + 10;

            factores++;
        }

        System.out.println("Obesidad: ");
        obesidad = cout.nextInt();
        if (obesidad == 1) {
            riesgo = riesgo + 10;

            factores++;
        }
        System.out.println("¿Fumas?: ");
        tabaquismo = cout.nextInt();
        if (tabaquismo == 1) {
            riesgo = riesgo + 10;

            factores++;
        }
        System.out.println("¿Haces ejercicio? :");
        inactividad = cout.nextInt();
        if (inactividad == 1) {
            riesgo = riesgo + 10;

            factores++;
        }
        System.out.println("Indica el sexo (siendo 1 masculino y 2 femenino: ");
        sexo = cout.nextInt();
        if (sexo == 1) {
            riesgo = riesgo + 5;

            factores++;
        }
        System.out.println("Algun familiar con problemas del corazon: ");
        corazon = cout.nextInt();
        if (corazon == 1) {
            riesgo = riesgo + 5;

            factores++;
        }
        System.out.println("Eres mayor de 55 años: ");
        mayor = cout.nextInt();

        if (mayor == 1) {
            riesgo = riesgo + 5;

            factores++;
        }

        switch (factores) {
            case 1:

                System.out.println("Tienes un riesgo de " + riesgo);

                break;

            case 2:

                friesgo = riesgo * 1.25;
                System.out.println("Tienes un riesgo de " + riesgo + " un efecto multiplicador de 1.25");
                System.out.println("Por tanto, el riesgo final es de: " + friesgo);
                break;

            case 3:
            case 4:

                friesgo = riesgo * 1.5;
                System.out.println("Tienes un riesgo de " + riesgo + " un efecto multiplicador de 1.5");
                System.out.println("Por tanto, el riesgo final es de: " + friesgo);
                break;

            case 5:
            case 6:

                friesgo = riesgo * 1.75;
                System.out.println("Tienes un riesgo de " + riesgo + " un efecto multiplicador de 1.75");
                System.out.println("Por tanto, el riesgo final es de: " + friesgo);
                break;

            case 7:
            case 8:

                friesgo = riesgo * 2;
                System.out.println("Tienes un riesgo de " + riesgo + " un efecto multiplicador de 2");
                System.out.println("Por tanto, el riesgo final es de: " + friesgo);
                break;

            case 9:

                friesgo = riesgo * 2.5;
                System.out.println("Tienes un riesgo de " + riesgo + " un efecto multiplicador de 2.5");
                System.out.println("Por tanto, el riesgo final es de: " + friesgo);
                break;
        }

    }

}
