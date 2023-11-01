/*Ejercicio 37
Realiza un conversor del sistema decimal al sistema de “palotes”.
*/

public class Eje37 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda = n;

        int volteado=0;
        int longitud=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
            longitud++;
        }

        int iteracion=1;
        System.out.print("El "+guarda+" en decimal es el ");
        do {
            int cifra=volteado%10;
            for(int i=0;i<=cifra;i++){
                if(i==cifra){
                    if(longitud==iteracion){
                        System.out.print("");
                    }else{
                        System.out.print("- ");
                    }
                }else{
                    System.out.print("| ");
                }
            }
            iteracion++;
            volteado/=10;
        } while (volteado>0);

    }
}
