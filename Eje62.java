/*Ejercicio 62
Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
*/

public class Eje62 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda=n;

        int bueno=0;
        int malo=0;
        while (n>0) {
            int cifra = n%10;

            switch (cifra) {
                case 3:
                case 7:
                case 8:
                case 9:
                    bueno++;
                    break;

                case 0:
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    malo++;
                    break;
            
                default:
                    break;
            }
            n/=10;
        }
        if(bueno>malo){
            System.out.printf("El %d es un número afortunado.",guarda);
        }else{
            System.out.printf("El %d no es un número afortunado.",guarda);
        }
        
    }
    
}
