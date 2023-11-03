/*Ejercicio 45
Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
*/

import java.util.Scanner;
public class Eje45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Introduzca la posición dentro del número: ");
        int pos = Integer.parseInt(sc.nextLine());

        System.out.print("Introduzca el nuevo dígito: ");
        int dig = Integer.parseInt(sc.nextLine());

        int volteado=0;
        while (n>0) {
            volteado=volteado*10+n%10;
            n/=10;
        }

        int recorre=1;
        int retorno=0;
        while (volteado>0) {
            if(recorre==pos){
                retorno=retorno*10+dig;
                volteado/=10;
                recorre++;
            }else{
                retorno=retorno*10+volteado%10;
                volteado/=10;
                recorre++;
            }
        }

        System.out.print("El número resultante es "+retorno);

        sc.close();
    }
}
