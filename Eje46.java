/*Ejercicio 46
Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
*/

public class Eje46 {
    public static void main(String[] args) {

        try {

            System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
            int anchura = Integer.parseInt(System.console().readLine());

            System.out.print("Ahora introduzca la altura (como mínimo 2): ");
            int altura = Integer.parseInt(System.console().readLine());

            if(anchura<2 || altura<2){
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altua es 2.");
            }else{

                for(int i=0; i<altura; i++){
                    for(int j=0; j<anchura; j++){
                        if(i==0 || j==0 || i==altura-1 ||j==anchura-1){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
            
        } catch (Exception e) {
            System.out.print("Error inesperado");
        }
        
    }
}
