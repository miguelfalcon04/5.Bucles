/*Ejercicio 36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
*/

public class Eje36 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = Long.parseLong(System.console().readLine());
        long guarda = n;

        long volteado=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
        }

        if(guarda==volteado){
            System.out.println(guarda+" es capicua");
        }else{
            System.out.println(guarda+ " no es capicua");
        }
        
    }
}
