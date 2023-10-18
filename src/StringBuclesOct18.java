public class StringBuclesOct18 {
    public static void main(String[] args) {
    String nombre = "Manolo";
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre);
        System.out.println(nombre.isEmpty());
        System.out.println(nombre.indexOf('n'));//Empezando desde 0
        System.out.println(nombre.indexOf('o'));
        System.out.println(nombre.lastIndexOf('o'));
        System.out.println(nombre.substring(3));
        System.out.println(nombre.substring(2,4));
        System.out.println(nombre.length());

        //Dada la cuenta bancaria 1234567890123456789
        //Se pide extraer los primeros 2 dígitos
        //se pide extraer los ultimos 10 dígitos
        //Se pide extraer la posicion 4 a 9

       String cuentaBancaria = "1234567890123456789";
        System.out.println(cuentaBancaria.substring(0,2));
        System.out.println(cuentaBancaria.substring(9));
        System.out.println(cuentaBancaria.substring(4,10));



    }
}
