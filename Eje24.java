/*Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
*/

public class Eje24 {
    public static void main(String[] args) {

        System.out.print("Pintaré una pirámide de altura: ");
        int n = Integer.parseInt(System.console().readLine());

        int cont=1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<i*2;k++){
                if(k<((i*2)/2)+1){
                    System.out.print(k);
                    cont=k;
                }else{
                    cont--;
                    System.out.print(cont);
                }
            }

            System.out.println();
        }
        
    }
}
