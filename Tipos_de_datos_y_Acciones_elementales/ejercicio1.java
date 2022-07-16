/* ¿De cuál tipo de dato sería la variable donde almacena lo siguiente?
 “Hola Mundo"
 Verdadero
 ‘1'
 ‘c'
 256
 8>19
*/
package Tipos_de_datos_y_Acciones_elementales;

public class ejercicio1 {
    
    public static void main(String[] args) {
        //ENTRADA
        String saludo= "Hola Mundo";
        boolean verdadero = true;
        char numeroChar= '1';
        char letra='c';
        int numero= 256;
        int numero1=8;
        
        //PROCESO
        if(verdadero == true){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es Falso");
        }
        
        if(numero1>19){
        System.out.println("El número 8 es mayor que 19");
    }else{
    System.out.println("El número 8 es menor que 19");
}
        //SALIDA
        System.out.print(saludo + " Es una variable String\n");
        System.out.print(verdadero + " Es una variable Booleana\n");
        System.out.print(numeroChar + " Es una variable char\n");
        System.out.print(letra + " Es una variable char\n");
        System.out.print(numero + " Es una variable int\n");
        
    }
    
}
