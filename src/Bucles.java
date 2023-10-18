import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
       /*
        System.out.println("escriba un numero");
        num = teclado.nextInt();
        System.out.println("Numero leido " + num);
        System.out.println("escriba un numero");
        num = teclado.nextInt();
        System.out.println("Numero leido " + num);
        System.out.println("escriba un numero");
        num = teclado.nextInt();
        System.out.println("Numero leido " + num);

        */

        //Equivalente en bucle

        for (int contadorInteracciones = 0; contadorInteracciones<3;contadorInteracciones++){
            System.out.println("escriba un numero");
            num = teclado.nextInt();
            System.out.println("Numero leido " + num);


        }
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }
}
