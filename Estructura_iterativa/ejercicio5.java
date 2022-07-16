//Dado un número entero N que representa una contraseña y asumiendo que una
//contraseña debe tener al menos 10 dígitos para ser segura, determine si la
//contraseña ingresada por el usuario es correcta, de no serlo debe pedirla
//nuevamente hasta que tenga los 10 (diez) dígitos solicitados y al ser correcta
//mostrar un mensaje de éxito al usuario, por salida estándar.
package Estructura_iterativa;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;
        String palabra = "";
        System.out.println("ingrese la contraseña");
        palabra = input.nextLine();
        N = palabra.length();
            while (N!=10) {
                System.out.println("Cantidad de digitos tienen que ser 10, vuelva a ingresarla");
                System.out.println("ingrese la contraseña");
                palabra = input.nextLine();
                N = palabra.length();
            }
             System.out.println("La contraseña es valida");
        }
    }
