/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructura_iterativa;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        double p=0;
        int c=0, s=0;
        System.out.println("Ingrese un numero: ");
        n = input.nextInt();
        s=s+n;
        while (n != 0) {
            System.out.println("Ingrese un numero: ");
            n = input.nextInt();
            c++;
            s=s+n;
        }
        p=s/c;
        System.out.println("El promedio de la serie es: "+p);
    }
}
