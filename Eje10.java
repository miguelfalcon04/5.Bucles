/*Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
*/

public class Eje10 {
    public static void main(String[] args) {

        int num;
        int suma=0;
        int i=0;

        do {
            System.out.print("Introduce su número: ");
            num = Integer.parseInt(System.console().readLine());
            if(num>=0){
            suma+=num;
            i++;
            }
        } while (num>=0);

        System.out.printf("La media es %.2f", ((float)suma/(float)i));
    }
}
