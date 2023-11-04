/*Ejercicio 53
Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
*/

public class Eje53 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=0; i<alt; i++){
            for(int j=0; j<alt-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
