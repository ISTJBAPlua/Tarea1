//Solicitar un número entre el 1 y el 12 e imprimir el mes correspondiente a dicho
//número.

package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        int mes = 0;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 12: ");
        mes = Integer.parseInt(ingresar.next());
        switch (mes) {
            case 1:
                System.out.println("El mes correspondiente es es Enero");
                break;
            case 2:
                System.out.println("El mes correspondiente es Febrero");
                break;
            case 3:
                System.out.println("El mes correspondiente es Marzo");
                break;
            case 4:
                System.out.println("El mes correspondiente es Abril");
                break;
            case 5:
                System.out.println("El mes correspondiente es Mayo");
                break;
            case 6:
                System.out.println("El mes correspondiente es Junio");
                break;
            case 7:
                System.out.println("El mes correspondiente es Julio");
                break;
            case 8:
                System.out.println("El mes correspondiente es Agosto");
                break;
            case 9:
                System.out.println("El mes correspondiente es Septiembre");
                break;
            case 10:
                System.out.println("El mes correspondiente es Octubre");
                break;
            case 11:
                System.out.println("El mes correspondiente es Noviembre");
                break;
            case 12:
                System.out.println("El mes correspondiente es Diciembre");
                break;

        }
    }

}
