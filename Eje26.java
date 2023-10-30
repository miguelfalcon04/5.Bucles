/*Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
*/

public class Eje26 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca un dígito: ");
        int dig = Integer.parseInt(System.console().readLine());

        int volteado=0;
        int longitud=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
            longitud++;
        }

        int retorno=0;
        int cont=0;
        int pos=0;
        System.out.print(dig + " podemos encontralo en la posición ");
        while(volteado>0){
            retorno=retorno*10+volteado%10;
            cont++;
            if(volteado%10==dig){
                pos=longitud-cont;
                System.out.print((pos+1)+" ");
            }
            volteado/=10;
        }

        
    }
}
