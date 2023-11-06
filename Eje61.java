/*Ejercicio 61
Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
*/

public class Eje61 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
        int alt = Integer.parseInt(System.console().readLine());

        int espaciosInterno=alt*2-2;

        if(alt>=3){

            for(int i=0; i<alt; i++){

                for(int j=0; j<i; j++){ //Espacios delante
                    System.out.print(" ");
                }

                System.out.print("***");
                for(int k=0; k<espaciosInterno;k++){
                    System.out.print(" ");
                }
                System.out.print("***");

                System.out.println();
                espaciosInterno-=2;
            }
        }else{
            System.out.print("Introduzca correctamente los datos");
        }
        
    }
}
