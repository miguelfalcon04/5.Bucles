/*Ejercicio 42
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.
*/

public class Eje42 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        boolean esPrimo=true;
        for(int i=n; i<n+5;i++){
            esPrimo=true;
            for(int j=2; j<i/2+1;j++){
                if(i%j==0){
                    esPrimo=false;
                }
            }
            if(esPrimo==false){
                System.out.print(i+" no es primo");
            }else{
                System.out.print(i+" es primo");
            }
            System.out.println();
        }
        
    }
}
