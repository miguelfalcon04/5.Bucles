/*Ejercicio 59
Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
*/

public class Eje59 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura del árbol: ");
        int alt = Integer.parseInt(System.console().readLine());

        /*Pinta la estralla en medio */
        for(int i=0; i<alt; i++){
            if(i==alt-1){
                System.out.println("*");
            }else{
                System.out.print(" ");
            }
        }

        for(int i=0; i<alt-2; i++){ /*alt-2 porque se le quita la estrella y el tronco */

            for(int j=0; j<=(alt-2)-i; j++){ /*Pinta los espacios de delante de la pirámide segun la altura*/
                System.out.print(" ");
            }

            for(int k=0; k<=i*2; k++){ 
                if(k==0||i==alt-3||k==i*2){ /*Si este bucle esta al inicio o al final, o si el bucle principal esta en su última línea, pinta ^ */
                    System.out.print("^");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*Pinta el tronco en medio */
        for(int i=0; i<alt; i++){
            if(i==alt-1){
                System.out.println("Y");
            }else{
                System.out.print(" ");
            }
        }

    }
}
