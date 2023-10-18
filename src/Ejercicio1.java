import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1.	Pedir un número N, y mostrar todos los números del 1 al N.
        //0. Declaracion de variables
        //primitiva
        int num = 0;
        //Instancia
        Scanner teclado = new Scanner(System.in);
        //Pedir nº y leerlo por la consola
        System.out.println("Escriba un numero");
        num = teclado.nextInt();

        for (int i = 1; i<=num;i++){
            System.out.println(i);
        }


    }
}
