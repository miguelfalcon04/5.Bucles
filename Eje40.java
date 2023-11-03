/*Ejercicio 40
Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
*/

public class Eje40 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura del rombo: ");
        int alt = Integer.parseInt(System.console().readLine());

        if(alt%2!=0 && alt>=3){

            for(int i=0; i<alt/2+1; i++){
                
                for(int j=alt/2+1; j<(alt-i); j++){
                    System.out.print(" ");
                }
                
                for(int k=0; k<i*2+1; k++){
                    if( k==0 || k==i*2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for(int i=alt/2-1; i>=0; i--){

                for(int j=i; j<alt/2; j++){
                    System.out.print(" ");
                }

                for(int k=0; k<i*2+1; k++){
                    if(k==0 || k==i*2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            


        }else{
            System.out.println("Introduza una altura válida");
        }

    }
}
