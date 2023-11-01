/*Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
*/

public class Eje34 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número: ");
        long n = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        long n2 = Long.parseLong(System.console().readLine());

        long volteado=0;
        while(n>0){
            volteado=volteado*10+n%10;
            n/=10;
        }

        long volteado2=0;
        while(n2>0){
            volteado2=volteado2*10+n2%10;
            n2/=10;
        }

        long digPar=0;
        long digImp=0;
        int cifra=0;
        int cifra2=0;
        while(volteado>0 && volteado2>0){
            cifra=(int)volteado%10;
            if(cifra%2==0){
                digPar=digPar*10+cifra;
            }else{
                digImp=digImp*10+cifra;
            }

            cifra2=(int)volteado2%10;
            if(cifra2%2==0){
                digPar=digPar*10+cifra2;
            }else{
                digImp=digImp*10+cifra2;
            }

            volteado/=10;
            volteado2/=10;
        }

        System.out.println("El número formado por los dígitos pares es "+digPar);
        System.out.println("El número formado por los dígitos impares es "+digImp);


        
    }
}
