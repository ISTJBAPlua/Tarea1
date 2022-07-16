//Dado un número entero N, calcular e informar al usuario cuántos dígitos tiene
//dicho número.
package Estructura_iterativa;

import javax.swing.JOptionPane;

public class ejercicio2 {

    public static void main(String[] args) {
        int numero;
        int invalido;
        int auxiliar;
        int digito;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        invalido = 0;
        auxiliar = numero;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            invalido = invalido * 10 + digito;
            auxiliar = auxiliar / 10;
        }
        if (numero == invalido) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
        }
    }
}
