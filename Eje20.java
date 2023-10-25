/*Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*/

import java.util.Scanner;
public class Eje20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide: ");
        int alt = sc.nextInt();

        for(int i=0; i<alt; i++){
            for(int j=0; j<alt-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i*2; k++){
                if(k==0 || k==i*2 || i==alt-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
