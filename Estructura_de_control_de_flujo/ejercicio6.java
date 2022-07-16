//En un estacionamiento el monto a pagar se calcula multiplicando el número de
//horas que permaneció el automóvil dentro del estacionamiento por Bs. 4 y se
//incrementa esta cantidad en Bs. 2,50 por cada media hora adicional.
//Ahora se desea que usted elabore un algoritmo que a partir de la hora de entrada
//y la hora de salida de un vehículo (las mismas corresponden a un mismo día)
//calcule el monto a pagar por el dueño del vehículo.
//La entrada vendrá dada por dos enteros positivos el primero representa las horas
//y el segundo los minutos, además por último se debe leer un carácter (A o P) que
//indica si la hora es AM o PM
package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio6 {
static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int horas;
        System.out.print("Digite la cantidad de horas: ");
        horas = entrada.nextInt();
        System.out.println("Precio: " + calcularPrecio(horas));
    }

    public static double calcularPrecio(int horas) {
        double precio = 0;
        if (horas <= 3) {
            precio = horas * 20;
        } else if (horas > 3 && horas <= 24) {
            precio = (3 * 20) + ((horas - 3) * 15);
            if (horas == 24) {
                precio = 250;
            }
        } else if (horas > 24) {
            precio = ((int) (horas / 24)) * 250 + (horas % 24 * 15);
        }
        return precio;
    }
}
