/*Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
*/

import java.util.Scanner;

public class Eje14 {
    public static Scanner sc;

    /**
     * Inicia el Scanner
     */
    public static void inicia(){
        sc = new Scanner(System.in);
    }

    /**
     * Cierra el Scanner
     */
    public static void finaliza(){
        sc.close();
    }

    /**
     * Te pide un numero
     * @param opc
     */
    public static int pideNum(){
        return sc.nextInt();
    }

    public static void main(String[] args) {
        inicia();

        System.out.print("Introduce la base: ");
        int base = pideNum();

        System.out.print("Introduce el exponente: ");
        int exp = pideNum();

        int potencia=1;
        for(int i=0; i<exp; i++){
            potencia*=base;
        }

        System.out.printf("%d^%d = %d",base,exp,potencia);

        finaliza();
    }
}
