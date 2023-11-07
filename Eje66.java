/*Ejercicio 66
La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error.
*/

public class Eje66 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());

        int espacio=0;
        if(alt>=3 && alt%2!=0){

            for(int i=0; i<alt; i++){

                for(int j=0; j<espacio; j++){
                    System.out.print(" ");
                }
                System.out.print("*");

                if(i<alt/2){
                    espacio++;
                }else{
                    espacio--;
                }

                for(int k=0; k<=4; k++){
                    if(k==4){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        }

    }
}
