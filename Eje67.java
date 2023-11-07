/*Ejercicio 67
Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
*/

public class Eje67 {
    public static void main(String[] args) {

        System.out.print("Introduzca el número de escalones: ");
        int numEscalones = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la altura de cada escalón: ");
        int altura = Integer.parseInt(System.console().readLine());

        int longitud=4;

        for(int i=0; i<numEscalones; i++){
            for(int k=0; k<altura; k++){
                for(int j=0; j<longitud; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            longitud+=4;
        }

    }
}