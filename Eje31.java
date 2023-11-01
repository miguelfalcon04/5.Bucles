/*Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
*/

public class Eje31 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la L: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=1; i<=alt; i++){
            if(i==alt){
                for(int j=0; j<(alt/2)+1;j++){
                    System.out.print("* ");
                }
            }else{
                System.out.println("*");
            }
        }
        
    }
}
