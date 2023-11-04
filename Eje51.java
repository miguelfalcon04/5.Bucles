/*Ejercicio 51
El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
*/

public class Eje51 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número entero (mayor que cero): ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda = n;

        int gusano=0;
        while (n>0) {
            int cifra = n%10;
            if(cifra==0 || cifra==8){
                n/=10;
            }else{
                gusano=gusano*10+cifra;
                n/=10;
            }
        }

        int retorno=0;
        while (gusano>0) {
            retorno=retorno*10+gusano%10;
            gusano/=10;
        }

        if(retorno==guarda){
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }else{
            System.out.println("Después de haber sido comido por el gusano numérico se queda en "+retorno);
        }
        

    }
}
