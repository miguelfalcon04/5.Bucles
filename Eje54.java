/*Ejercicio 54
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
*/

public class Eje54 {
    public static void main(String[] args) {

        System.out.print("Introduce la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=0; i<alt; i++){
            for(int j=0; j<alt-i; j++){
                if(i==0 || j==0 || j==(alt-i)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
