/*Ejercicio 30
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */

import java.util.Scanner;
public class Eje30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer día de la semana: ");
        String dia1 = sc.next();

        System.out.print("Introduzca la hora: ");
        int h1 = sc.nextInt();

        int valor1=0;

        switch (dia1){

            case "1":
                valor1=1;
            break;

            case "2":
                valor1=2;
            break;

            case "3":
                valor1=3;
            break;

            case "4":
                valor1=4;
            break;

            case "5":
                valor1=5;
            break;

            case "6":
                valor1=6;
            break;

            case "7":
                valor1=7;
            break;

            case "lunes":
                valor1=1;
            break;

            case "martes":
                valor1=2;
            break;

            case "miercoles":
                valor1=3;
            break;

            case "jueves":
                valor1=4;
            break;

            case "viernes":
                valor1=5;
            break;

            case "sabado":
                valor1=6;
            break;

            case "domingo":
                valor1=7;
            break;

        }

        System.out.print("Introduzca el segundo día de la semana: ");
        String dia2 = sc.next();

        System.out.print("Introduzca la hora: ");
        int h2 = sc.nextInt();

        int valor2=0;

        switch (dia2){

            case "1":
                valor2=1;
            break;

            case "2":
                valor2=2;
            break;

            case "3":
                valor2=3;
            break;

            case "4":
                valor2=4;
            break;

            case "5":
                valor2=5;
            break;

            case "6":
                valor2=6;
            break;

            case "7":
                valor2=7;
            break;

            case "lunes":
                valor2=1;
            break;

            case "martes":
                valor2=2;
            break;

            case "miercoles":
                valor2=3;
            break;

            case "jueves":
                valor2=4;
            break;

            case "viernes":
                valor2=5;
            break;

            case "sabado":
                valor2=6;
            break;

            case "domingo":
                valor2=7;
            break;

        }

        if(valor1<valor2){
            System.out.printf("Entre las %d:00 del %s y las %d:00 del %s hay %d hora/s",h1,dia1,h2,dia2,((24-h1)+((valor2-valor1)-1)*24+(h2)));

        }else{
            System.out.print("El segundo día introducido debe ser posterior al primero");
        }

        sc.close();
        
    }
}
