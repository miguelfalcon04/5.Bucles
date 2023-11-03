/*Ejercicio 38
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*/

public class Eje38 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
        int alt = Integer.parseInt(System.console().readLine());

        if(alt%2!=0 && alt>=3){

            for(int i=alt/2+1; i>0;i--){

                for(int j=i; j<alt/2+1; j++){
                    System.out.print(" ");
                }

                for(int k=0; k<(i*2)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=1; i<=alt/2; i++){

                for(int j=alt/2+1; j<alt-i; j++){
                    System.out.print(" ");
                }

                for(int k=0; k<i*2+1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }else{
            System.out.println("La altura debe ser impar mayor o igual a 3");
        }
    }
}
