/*Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/

public class Eje21 {
    public static void main(String[] args) {

        int n=0;
        int i=0;
        int maxPar=0;
        int contImp=0;
        int sumaImp=0;

        do{
            System.out.print("Introduzca su número: ");
            n = Integer.parseInt(System.console().readLine());
                if(n>0){
                    i++;

                    if(n%2!=0){
                        contImp++;
                        sumaImp+=n;
                    }

                    if(n%2==0 && n>maxPar){
                        maxPar=n;
                    }
                }

        }while(n>0);

        System.out.printf("Se han introducido %d números\n",i);
        System.out.printf("La media de los impares es: %.2f\n",(float)sumaImp/(float)contImp);
        System.out.printf("El máximo par es: %d",maxPar);
        
    }
}
