//El IMC resulta de la división de la masa del individuo (en kilogramos) entre el
//cuadrado de la estatura (en metros). El índice de masa corporal es un indicador
//del peso de una persona en relación con su altura.
//Clasificación del IMC de acuerdo con la OMS de la ONU:
//a. Menor a 16: Criterio de ingreso.
//b. 16 a 16.9: infra peso.
//c. 17 a 18.4: bajo peso.
//d. 18.5 a 24.9: peso normal.
//e. 25 a 29.9: sobrepeso.
//f. 30 a 34.9: obesidad pre-mórbida.
//g. 40 a 45: obesidad mórbida.
//h. Mayor a 45: obesidad híper-mórbida.
//Dado el peso de una persona en libras (1 libra = 0,453592 Kg) y su estatura en
//centímetros, calcule su IMC e indique como salida el peso en kilogramos, el valor
//de IMC de la persona y la categoría en la cual fue clasificado.
package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

        double kilogramos;
        double libras;
        double estatura;
        String clasificacion = "";

        System.out.print("Ingrese su peso en libras: ");
        libras = in.nextDouble();
        in.nextLine();

        System.out.print("Ingrese Su estatura en centimetros: ");
        estatura = in.nextInt();
        in.nextLine();

        kilogramos = libras / 0.453;

        System.out.println("Valor en KG es: " + kilogramos);

        double imc = calcularIMC(estatura, kilogramos);

        if (imc < 16) {
            clasificacion = "Criterio de ingreso";
        } else if (imc < 16 || imc <= 16.9) {
            clasificacion = "Infrapeso";
        } else if (imc >= 17 || imc <= 18.4 ) {
            clasificacion = "Baja Peso";
        } else if (imc >= 18.5 || imc <= 24.9) {
            clasificacion = "Peso normal";
        } else if (imc >= 25 || imc <= 29.9) {
            clasificacion = "Sobrepeso";
        } else if (imc >= 30 || imc <= 34.9) {
            clasificacion = "Obesidad pre-mórbida";
        } else if (imc >= 45) {
            clasificacion = "obesidad híper-mórbida.";
        }

        System.out.println("\nTu índice de masa corporal es (IMC): " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);

    }

    private static double calcularIMC(double altura, double peso) {
        double imc = peso / (Math.pow(altura, 2));
        return Math.rint(imc * 100) / 100;
    }
}

