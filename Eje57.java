/*Ejercicio 57
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
*/

public class Eje57 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=0; i<alt; i++){

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<alt-i; k++){
                if(k==0||k==(alt-i)-1||i==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        
    }
}
