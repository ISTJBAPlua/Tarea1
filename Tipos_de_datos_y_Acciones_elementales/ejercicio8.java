//Dado un (1) número, imprimir Positivo o negativo según sea el numero.
package Tipos_de_datos_y_Acciones_elementales;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe un número:");

        double numero = escaner.nextDouble();

        if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }

    }
}
