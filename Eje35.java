/*Ejercicio 35
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
*/

public class Eje35 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la X: ");
        int alt = Integer.parseInt(System.console().readLine());

        if(alt%2==0 || alt<3){
            System.out.print("Introduzca datos correctos");
        }else{
            for(int i=0; i<alt; i++){
                for(int j=0; j<alt; j++){
                    if(i==j || j==alt-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}
