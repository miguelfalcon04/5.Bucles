/*Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
*/

public class Eje29 {
    public static void main(String[] args) {

        System.out.print("Introduce el primer número: ");
        int n = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el numero divisor: ");
        int div = Integer.parseInt(System.console().readLine());

        for(int i=0 ; i<n; i++){
            if(i%div==0){
            }else{
                System.out.print(i+" ");
            }
        }
        
    }
}
