/*Ejercicio 68
Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
*/

public class Eje68 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número: ");
        long n = Long.parseLong(System.console().readLine());
        long guarda = n;

        long volteado=0;
        while (n>0) {
            long cifra = n%10;
            if(cifra%2==0){
                cifra++;
            }else{
                cifra--;
            }

            volteado=volteado*10+cifra;
            n/=10;
        }

        long devuelve=0;
        while (volteado>0) {
            devuelve=devuelve*10+volteado%10;
            volteado/=10;
        }

        System.out.printf("Discolando el %d sale el %d",guarda,devuelve);

    }
}
