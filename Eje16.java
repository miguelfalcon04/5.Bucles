/*Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
*/

public class Eje16 {
    public static void main(String[] args) {

        System.out.print("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());

        boolean esPrimo = true;
        for(int i=2; i<n/2+1; i++){
            if(n%i==0){
                esPrimo=false;
            }
        }

        if(esPrimo==false){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }

    }
}
