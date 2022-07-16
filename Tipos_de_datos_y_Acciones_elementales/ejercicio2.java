/*¿Siguiendo la prioridad de operadores, convierta a expresión matemática,
resuelva e indique en cuál tipo de variable almacenará el resultado de las
siguientes expresiones:
 (5 + 3 * 2) + 9 > 3 * 5 * 14 % 3
 2 *(4 – 10 + 8)/2* 36 *(1/2)
 260 / 12 + 54 % 3 – 85 % 7
 (48 < 2 * 3) | | (2 * 7 < 12)
 ((8 > 2) | | (932 < 23) ) && 4 == 2
*/
package Tipos_de_datos_y_Acciones_elementales;

public class ejercicio2 {

    public static void main(String[] args) {
        int linea1=0;
        int linea2=0;
        int linea3=0;
        int calcular = 0;
        int linea4=0;
        int linea5=0;
        int linea6=0;
        
        // (5 + 3 * 2) + 9 > 3 * 5 * 14 % 3
        linea1 = (5 + 3 * 2) + 9;
        linea2 = 3 * 5 * 14 % 3;
        
        
        if(linea1 > linea2){
            System.out.println("La suma de del primer reltado es: " + linea1 + " y es mayor que el segundo resultado");
        }else{
            System.out.println("la suma del segundo resultado es: " + linea2 + " y es mayor que el primer resultado");
        }
        // 2 *(4 – 10 + 8)/2* 36 *(1/2)
        linea3 = 2*(4-10+8)/2 *36*(1/2);
        calcular = linea3 *36*(1/2);
        
        System.out.println("La segunda operacion tiene un total de: " + calcular);
        
    }
}