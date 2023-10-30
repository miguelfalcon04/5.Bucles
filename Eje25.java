/*Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
*/

public class Eje25 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());

        int volteado=0;
        do{
            volteado=volteado*10+n%10;
            n/=10;
        }while(n>0);
        System.out.println("El número volteado es: "+ volteado);
    }
}
