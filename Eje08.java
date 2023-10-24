/*Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mostraré la tabla del: ");
        int tabla = Integer.parseInt(sc.nextLine());

        for(int i=0; i<=10; i++){
            System.out.printf("%d  *%3d = %2d\n",tabla,i,(tabla*i));
        }

        sc.close();
    }
}
