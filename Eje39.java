/*Ejercicio 39
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
*/

public class Eje39 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        int fact=1;
        for(int i=1; i<=n; i++){
            fact=1;
            for(int j=1; j<=i;j++){
                fact=fact*j;
            }
        System.out.println(i+"! = "+fact);
        }

    }
}
