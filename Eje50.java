/*Ejercicio 50
Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.
*/

public class Eje50 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura (5 como mínimo): ");
        int alt = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int esp = Integer.parseInt(System.console().readLine());

        if(alt<5 && esp<1){
            System.out.println("Error, tienes que introducir una altura minima de 5 y un espaciado minimo de 1");
        }else{
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("*   ");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("*");
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
            for(int i = 1;i<=alt-4;i++){
                System.out.print("*");
                for(int e = 1; e<=esp;e++){
                    System.out.print(" ");
                }
                System.out.print("   *");
                for(int e = 1; e<=esp;e++){
                    System.out.print(" ");
                }
                System.out.println("   *");
            }
            System.out.print("*");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.print("****");
            for(int i = 1; i<=esp;i++){
                System.out.print(" ");
            }
            System.out.println("****");
        }
        
    }
}
