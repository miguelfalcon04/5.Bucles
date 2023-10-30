/*Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
*/

public class Eje23 {
    public static void main(String[] args) {



        try {

            int suma=0;
            int i=0;
            
            do {
                System.out.print("Introduzca su número: ");
                int n = Integer.parseInt(System.console().readLine());

                if(suma+n>10000){
                    break;
                }

                if(n>0){
                    suma+=n;
                    i++;
                }

            } while (suma<10000);

            System.out.printf("Total acumulado: %d\nNúmeros válidos introducidos: %d\nMedia de los números: %.2f",suma,i,(float)suma/(float)i);
        }
        catch (Exception e) {
            System.out.println("Error inesperado");
        }

    }
}
