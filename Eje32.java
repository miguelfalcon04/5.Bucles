/*Ejercicio 32
Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
*/

public class Eje32 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = Long.parseLong(System.console().readLine());

        long volteado=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
        }

        int suma=0;
        System.out.print("Dígitos pares: ");
        while(volteado>0){

            int cifra = (int)volteado%10;

            if(cifra%2==0){
                System.out.print(cifra+" ");
                suma+=cifra;
            }

            volteado/=10;
        }

        System.out.println();
        System.out.print("Suma de los dígitos pares: "+suma);
        
    }
}
