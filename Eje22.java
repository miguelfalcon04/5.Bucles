/*Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*/

public class Eje22 {
    public static void main(String[] args) {

        boolean esPrimo = true;

        for(int i=2; i<=100; i++){
            esPrimo = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    esPrimo=false;
                }
            }
            if(esPrimo==true){
            System.out.print(i+" ");
            }
        }

    }
}
