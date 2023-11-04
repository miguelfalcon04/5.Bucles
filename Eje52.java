/*Ejercicio 52
Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.
*/

public class Eje52 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());

        int volteado=0;
        while (n>0) {
            volteado=volteado*10+n%10;
            n/=10;
        }

        int recoge=volteado%10;
        volteado/=10;

        int retorno=0;
        while (volteado>0) {
            retorno=retorno*10+volteado%10;
            volteado/=10;
        }

        System.out.println("El número resultado es "+(retorno*10+recoge));
        
    }
}
