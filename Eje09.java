/*Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long) 
*/

public class Eje09 {

    public static int longitudDeUnNumero(int num){
        int longitud = 0;
        while(num>0){
            longitud++;
            num/=10;
        }
        return longitud;
    }

    public static void main(String[] args) {

        /*System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(System.console().readLine());
        int guarda = num;
        int dig = 0;

        do{
            num = num/10;
            dig++;
        }while(num>0);

        System.out.printf("%d tiene %d digitos",guarda,dig);*/

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(n + " tiene " + longitudDeUnNumero(n) + " cifras");

    }
}
