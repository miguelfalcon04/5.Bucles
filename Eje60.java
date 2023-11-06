/*Ejercicio 60
Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
*/

public class Eje60 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de los calcetines: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=0; i<alt-2; i++){
            System.out.println("***     ***");
        }

        for(int i=0; i<2; i++){
            System.out.println("******  ******");
        }
        
    }
}
