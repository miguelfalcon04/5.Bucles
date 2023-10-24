/*Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
*/

public class Eje13{
    public static void main(String[] args) {

        int pos=0;
        int neg=0;
        int nulo=0;

        for(int i=1; i<=10; i++){
            System.out.print("Introduce el "+i+" número: ");
            int n = Integer.parseInt(System.console().readLine());

            if(n<0){
                neg++;
            }else if(n>0){
                pos++;
            }else{
                nulo++;
            }
        }

        System.out.printf("Hay %d positivos, %d negativos",pos,neg);
        if(nulo>0){
            System.out.printf(" y %d nulos", nulo);
        }
        
    }
}