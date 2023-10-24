/*Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
*/

public class Eje12 {
    public static void main(String[] args) {

        System.out.print("Cantidad de números de la sucesión a mostrar: ");
        int n = Integer.parseInt(System.console().readLine());

        int s1=0;
        int s2=1;
        int guarda=0;

        for(int i=0; i<n; i++){
            guarda=s1;
            s1=s2;
            s2=guarda+s2;
            System.out.print(s1+" ");
        }
    }
}
