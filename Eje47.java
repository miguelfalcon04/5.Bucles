/*Ejercicio 47
Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
*/

public class Eje47 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int alt = Integer.parseInt(System.console().readLine());

        if(alt<5 || alt%2==0){
            System.out.print("La altura introducida no es correcta");
        }else{
            for(int i=0; i<alt; i++){
                for(int j=0; j<6; j++){
                    if(i==0 || i==alt-1 || j==0 || j==5 ||i==alt/2){
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}
