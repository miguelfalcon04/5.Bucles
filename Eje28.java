/*Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
*/

public class Eje28 {
    public static void main(String[] args) {
        
        System.out.print("Hacer el factorial de: ");
        int n = Integer.parseInt(System.console().readLine());

        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.print(n+"! = "+fact);
    }
}
