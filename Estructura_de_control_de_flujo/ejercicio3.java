//Cree un algoritmo que tome por entrada las horas y minutos de un día y dé como
//resultado su equivalente en segundos.
package Estructura_de_control_de_flujo;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
final int hora=3600;
        final int minutos=60;
        //creamos variables
                int t,h,m,s;
                Scanner teclado= new Scanner(System.in);
                System.out.println("tiempo en segundos: ");
                t=teclado.nextInt();
                h=t/hora;
                t=t % hora;
                m= t/ minutos;
                s= t % minutos;
                
                System.out.println("");
                System.out.println("hora: " +h);
                System.out.println("minutos: "+m);
                System.out.println("segundo: "+s);
                System.out.println("");
    }
    
}
