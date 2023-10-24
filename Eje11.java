/*Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/

public class Eje11 {
    public static void main(String[] args) {

        System.out.print("Introduzca el numero del que saldrán los siguientes: ");
        int n = Integer.parseInt(System.console().readLine());

        for(int i=1; i<=5; i++){
            System.out.printf("%dº %8d %8d %8d\n",i,n,n*n,n*n*n);
            n+=1;
        }
    }
}
