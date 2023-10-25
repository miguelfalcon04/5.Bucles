/*Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
*/

import java.util.Scanner;
public class Eje19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int alt = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el caracter con el que pintar la pirámide: ");
        String c = sc.nextLine();

        for(int i = 1; i<=alt; i++){

            for(int j=0; j<alt-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<i*2; k++){
                System.out.print(c);
            }

            System.out.println();
        }

        sc.close();
    }
}
