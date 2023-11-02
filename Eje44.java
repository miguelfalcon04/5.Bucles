/*Ejercicio 44
Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
*/

public class Eje44 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca el número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int pos = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el digito que quiere insertar: ");
        int dig = Integer.parseInt(System.console().readLine());

        int volteado=0;
        while (n>0) {
            volteado=volteado*10+n%10;
            n/=10;
        }

        int recorre=1;
        int retorno=0;
        while (volteado>0) {
            if(recorre==pos){
                retorno=retorno*10+dig;
                recorre++;
            }else{
                retorno=retorno*10+volteado%10;
                volteado/=10;
                recorre++;
            }
        }

        System.out.print("El número resultante es "+retorno);
        
    }
}
