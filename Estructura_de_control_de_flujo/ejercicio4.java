//Para un valor entero positivo que representa una cantidad en segundos, indicar
//su equivalente en minutos, horas y días.

package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.print("MOSTRAR LA CANTIDAD DE HORAS Y MINUTOS.\n\n");
        System.out.print("Ingrese una cantidad en segundos : ");
        segundos = Integer.parseInt(ingreso.next());
        horas = segundos / 3600;
        minutos = segundos / 60;
        System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minutos);
    }
}
