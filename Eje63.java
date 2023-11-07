/*Ejercicio 63
Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
*/

public class Eje63 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int piramide1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int piramide2 = Integer.parseInt(System.console().readLine());

        int c=0;

        for(int i=0; i<=piramide1; i++){

            for(int j=0; j<piramide1-i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<i*2-1; k++){
                if(k==(i*2)-2){
                    System.out.print("* ");
                }else{
                    System.out.print("*");
                }
            }

                if(i>=piramide2){
                    for(int a=0; a<(piramide2-c)*2; a++){
                        System.out.print(" ");
                    }

                    for(int b=0; b<c*2-1; b++){
                        System.out.print("*");
                    }
                    c++;
                }
            System.out.println();

        }
        
    }
}
