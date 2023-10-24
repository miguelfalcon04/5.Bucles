/*Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte. 
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oportunidades = 4;
        int combi = 1234;
        boolean salir = false;

        do{
            System.out.print("Introduzca la combinación de la caja fuerte: ");
            int intento = Integer.parseInt(sc.nextLine());

            if(intento==combi){
                System.out.println("La caja fuerte se ha abieto satisfactoriamente");
                salir=true;
            }else{
                oportunidades--;
                System.out.println("Lo siento esa no es la combinación, le quedan " + oportunidades + " opotunidades");
            }

        }while(oportunidades!=0 && salir==false);

        sc.close();
    }
}
