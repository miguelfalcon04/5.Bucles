/*Ejercicio 43
Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).
*/
public class Eje43 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int pos = Integer.parseInt(System.console().readLine());

        int volteado=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
        }

        int recorre=1;
        int retorno=0;
        do{
            retorno=retorno*10+volteado%10;
            volteado/=10;
            recorre++;
        }while(pos!=recorre);

        int resto=0;
        while (volteado>0){
            resto=resto*10+volteado%10;
            volteado/=10;
        }

        System.out.print("Los numeros partidos son "+retorno + " y el "+resto);
    }
}
