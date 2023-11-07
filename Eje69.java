/*Ejercicio 69
Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.
*/

public class Eje69 {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la pirámide maya: ");
        int alt = Integer.parseInt(System.console().readLine());

        int linea=3;
        int asteriscos=2;

        for(int i=1; i<=alt; i++){

            for(int j=1; j<=alt-i;j++){
                System.out.print(" ");
            }

            for(int k=1; k<=linea*2; k++){
                if(i%2!=0){
                    System.out.print("*");
                }else{
                    for(int a=1; a<=asteriscos; a++){
                        System.out.print("*");
                    }
                    System.out.print("    ");
                    for(int a=1; a<=asteriscos; a++){
                        System.out.print("*");
                    }
                    asteriscos+=2;
                    break;
                }
            }
            linea+=1;
            System.out.println();
        }
        
    }
}
