/*Ejercicio 55
Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
*/

public class Eje55 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());

        if(n>=10){
            int cifra=n%10;
            n/=10;
            System.out.print("El número resultado es "+cifra+""+n);
        }else{
            System.out.println("El número resultado es "+n);
        }
        
    }
}
