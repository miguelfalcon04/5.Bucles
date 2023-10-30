/*Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
*/

public class Eje27 {
    public static void main(String[] args) {

        System.out.print("Introduzca su número: ");
        int n = Integer.parseInt(System.console().readLine());

        int cont=0;
        int suma=0;
        System.out.print("Los múltiplos de 3 son: ");
        for(int i=1; i<=n; i++){
            if(i%3==0){
                cont++;
                suma+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Suman: "+suma);
        System.out.println("En total son: "+cont);
    }
}
