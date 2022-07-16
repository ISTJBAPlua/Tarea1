//Dados dos (2) números calcule la suma, resta, multiplicación, división y módulo.
package Tipos_de_datos_y_Acciones_elementales;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 25;
        int suma =0;
        int resta =0;
        int multiplicacion =0;
        float division = 0;
        int modulo = 0;
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = (numero1 / numero2);
        modulo = numero1 % numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es: " + division);
        System.out.println("La modulo de " + numero1 + " y " + numero2 + " es: " + modulo);
    
    
    
    
    }
    
}
