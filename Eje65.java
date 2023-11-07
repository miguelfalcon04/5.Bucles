/*Ejercicio 65
Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
*/

public class Eje65 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int alt = Integer.parseInt(System.console().readLine());

        if(alt>=3){
            System.out.printf("Introduzca la fila del palito horizontal (entre 2 y %d): ",(alt-1));
            int palito = Integer.parseInt(System.console().readLine());

            if(palito<2 || palito>alt-1){
                System.out.print("La fila introducida no es correcta");
            }else{

                for(int i=1; i<=alt; i++){

                    for(int j=0; j<alt-i; j++){
                        System.out.print(" ");
                    }

                    for(int k=0; k<i*2-1; k++){
                        if(k==0 || k==i*2-2 || i==palito){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

        }else{
            System.out.print("La altura introducida no es correcta");
        }

    }
}
