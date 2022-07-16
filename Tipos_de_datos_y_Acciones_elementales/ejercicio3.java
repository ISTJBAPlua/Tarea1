//¿Siguiendo la prioridad de operadores, convierta a expresión matemática,resuelva e indique en cuál tipo de variable almacenará el resultado de las siguientes expresiones:
package Tipos_de_datos_y_Acciones_elementales;

public class ejercicio3 {

    public static void main(String[] args) {
        int ln1 = 0;
        int ln2 = 0;
        int a = 600;
        int b = 10;
        int c = 12;
        ln1 = (a + (b / c)) / ((a / b) + c);
        ln2 = (a / (a + b)) / (a / (a - b));

        System.out.println("El resultado de la primera operacion es: " + ln1
                + " \n El resultado de la seguda operacion es: " + ln2);
    }
}