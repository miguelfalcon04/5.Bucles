/*Ejercicio 49
Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
*/

public class Eje49 {
    public static void main(String[] args) {
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");

        boolean esPrimo = true;
        int cont=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma=0;

        do {
            esPrimo=true;
            int n = Integer.parseInt(System.console().readLine());

            for(int i=2; i<n/2+1; i++){
                if(n%i==0){
                    esPrimo=false;
                }
            }

            if(esPrimo==false){

                if(n<min){
                    min=n;
                }
                if(n>max){
                    max=n;
                }
                suma+=n;
                cont++;
            }

        } while (esPrimo==false);

        System.out.println("Ha introducido "+cont+" números no primos");
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.printf("Media: %.2f",(float)suma/(float)cont);
        
    }
}
