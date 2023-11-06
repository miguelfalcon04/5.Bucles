/*Ejercicio 58
Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.
*/

public class Eje58 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());

        int suma=0;
        int cont=0;
        while (n>0) {
            int cifra=n%10;
            suma+=cifra;
            cont++;
            n/=10;
        }

        System.out.printf("La media de sus dígitos es %.2f",(float)suma/(float)cont);
        
    }
}
