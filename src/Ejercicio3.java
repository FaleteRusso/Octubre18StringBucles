import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3.	Pedir 5 números y escribir la suma total
        int digito= 0;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);



        for (int i=1; i<=5 ; i++){

            System.out.println("Escriba su numero");
            digito= teclado.nextInt();
            suma = suma + digito;
            System.out.println("volor variable suma-->"+ suma);
        }
    }
}
