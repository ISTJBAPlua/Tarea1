//Dado un número N determinar si es un número primo.
//Nota: Un número primo es aquel que solo es divisible por 1(uno) y por el mismo.

package Estructura_iterativa;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {
        //ENTRADA
        int numero = 7;
        int antecesores = 0;
        int residuo = 0;
        int contadordivisibles = 0;
        //PROCESO
        //JOptionPane.showMessageDialog(null, "Ingrese un numero");
        antecesores = numero - 1;
        while (antecesores > 1) {
            if (numero % antecesores == 0) {
                contadordivisibles++;

            }
            antecesores--;

        }
        //VALIDAR SI ES PRIMO
        if (contadordivisibles == 0) {
            JOptionPane.showMessageDialog(null, "Es primo");

        } else {
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }
}