/*Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
*/

public class Eje17 {
    public static void main(String[] args) {

        System.out.print("Introduce un número: ");
        int n = Integer.parseInt(System.console().readLine());

        int suma=0;

        if(n>0){
            for(int i=1; i<=100; i++){
                suma+=n;
                n++;
                if(i==100){
                    System.out.println("La suma es "+suma);
                }
            }
        }else{
            System.out.println("Intrduzca un número entero y positivo");
        }
        
    }
}
