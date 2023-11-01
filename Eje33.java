/*Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
*/

public class Eje33 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la pirámide: ");
        int alt = Integer.parseInt(System.console().readLine());

        for(int i=1; i<=alt; i++){
            if(i==alt){
                for(int k=1; k<=alt;k++){
                    if(k==1||k==alt){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }else{
                for(int j=1; j<=alt; j++){
                    if(j==1|| j==alt){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
