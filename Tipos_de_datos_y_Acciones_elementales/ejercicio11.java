//Dado un (1) número de cuatro (4) dígitos imprimirlo por separado en unidades,
//decenas, centenas y unidades de mil.
package Tipos_de_datos_y_Acciones_elementales;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        int numero = 0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un numero: \n");
        numero = escaner.nextInt();

        int millares = numero / 1000;
        int centenas = (numero - (millares * 1000)) / 100;
        int decenas = (numero - (millares * 1000 + centenas * 100)) / 10;
        int unidades = numero - (millares * 1000 + centenas * 100 + decenas * 10);

        System.out.println("Millares = " + millares);
        System.out.println("Centenas = " + centenas);
        System.out.println("Decenas = " + decenas);
        System.out.println("Unidades = " + unidades);
    }
}
