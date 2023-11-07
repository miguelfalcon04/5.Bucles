/*Ejercicio 41
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
*/

public class Eje41 {

    public static int cuentaPares(long valor){
        int pares = 0;
        while (valor>0) {
            if((valor%10)%2==0){
                pares++;
            }
            valor/=10;
        }
        return pares;
    }

    public static int cuentaImpares(long valor){
        int impares = 0;
        while (valor>0) {
            if((valor%10)%2!=0){
                impares++;
            }
            valor/=10;
        }
        return impares;
    }

    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = Long.parseLong(System.console().readLine());

        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares",n,cuentaPares(n),cuentaImpares(n));

        /* 
        long guarda = n;

        int par=0;
        int imp=0;

        while(n>0){
            int cifra = (int)n%10;

            if(cifra%2==0){
                par++;
            }else{
                imp++;
            }

            n/=10;
        }

        System.out.printf("El %d contiene %d dígitos pares y %d digitos impares.",guarda,par,imp);
        */
    }
}
