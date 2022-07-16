//Todos los años que se dividen exactamente entre 400, o que son divisibles
//exactamente entre 4 y no son divisibles exactamente entre 100 son años bisiestos.
//Usando estas premisas crea un algoritmo que lea una fecha como un número
//entero con el formato ddmmaaaa, y luego extraiga el año de la fecha indicando si
//el mismo es un año bisiesto o no.
package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
        System.out.println("Ingresa dia:");
        dia = sc.nextInt();
        System.out.println("Ingresa mes: ");
        mes = sc.nextInt();
        System.out.println("Ingresa año: ");
        anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " Si es bisiesto ");
        } else {
            System.out.println("El año " + anio + " No es bisiesto ");
        }
    }
}
