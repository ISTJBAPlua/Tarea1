//Dado un (1) número, imprimir 0 si es par y 1 si es impar
package Tipos_de_datos_y_Acciones_elementales;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("EL NUMERO ES PAR");
        } else {
            System.out.printf("EL NUMERO ES IMPAR");
        }
    }
}
