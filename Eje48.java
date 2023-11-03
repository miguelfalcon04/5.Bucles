/*Ejercicio 48
Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.
*/

public class Eje48 {
    public static void main(String[] args) {

        System.out.print("Introduzca un número entero: ");
        int n = Integer.parseInt(System.console().readLine());

        boolean cero = false;
        boolean uno = false;
        boolean dos = false;
        boolean tres = false;
        boolean cuatro = false;
        boolean cinco = false;
        boolean seis = false;
        boolean siete = false;
        boolean ocho = false;
        boolean nueve = false;

        while (n>0) {
            int cifra = n%10;
            switch (cifra) {
                case 0:
                    cero=true;
                    break;
                case 1:
                    uno=true;
                    break;

                case 2:
                    dos=true;
                    break;

                case 3:
                    tres=true;
                    break;

                case 4:
                    cuatro=true;
                    break;

                case 5:
                    cinco=true;
                    break;

                case 6:
                    seis=true;
                    break;

                case 7:
                    siete=true;
                    break;

                case 8:
                    ocho=true;
                    break;

                case 9:
                    nueve=true;
                    break;
            }
            n/=10;
        }

        System.out.print("Dígitos que aperecen en el número: ");
        if(cero==true){
            System.out.print(0+" ");
        }
        if(uno==true){
            System.out.print(1+" ");
        }
        if(dos==true){
            System.out.print(2+" ");
        }
        if(tres==true){
            System.out.print(3+" ");
        }
        if(cuatro==true){
            System.out.print(4+" ");
        }
        if(cinco==true){
            System.out.print(5+" ");
        }
        if(seis==true){
            System.out.print(6+" ");
        }
        if(siete==true){
            System.out.print(7+" ");
        }
        if(ocho==true){
            System.out.print(8+" ");
        }
        if(nueve==true){
            System.out.print(9+" ");
        }

        System.out.println();
        System.out.print("Dígitos que no aparecen: ");

        if(cero==false){
            System.out.print(0+" ");
        }
        if(uno==false){
            System.out.print(1+" ");
        }
        if(dos==false){
            System.out.print(2+" ");
        }
        if(tres==false){
            System.out.print(3+" ");
        }
        if(cuatro==false){
            System.out.print(4+" ");
        }
        if(cinco==false){
            System.out.print(5+" ");
        }
        if(seis==false){
            System.out.print(6+" ");
        }
        if(siete==false){
            System.out.print(7+" ");
        }
        if(ocho==false){
            System.out.print(8+" ");
        }
        if(nueve==false){
            System.out.print(9+" ");
        }
    }
}
