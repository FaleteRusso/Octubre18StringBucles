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

        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
        String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";
        //1
        System.out.println(cadena.toUpperCase());
        //2
        System.out.println(cadena.toLowerCase());
        //3
        System.out.println(cadena.substring(0,5));
        //4
        System.out.println(cadena.substring(16,21));
        /*
        forma pro

        int posicionInicial = cadena.indexOf("mosca");
        System.out.println(posicionInicial);
        System.out.println("mosca".length());
        System.out.println("("+ cadena.substring(posicionInicial,posicionInicial+"mosca".length())+")");

         */
        //5
        System.out.println(cadena.substring(31,37));
        /*
        forma pro

        System.out.println(posicionInicial);
        System.out.println("cabeza".length());
        System.out.println("("+ cadena.substring(posicionInicial,posicionInicial+"cabeza".length())+")");

         */
        //6
        System.out.println(cadena.indexOf('m'));
        //7
        System.out.println("Longitud ->" + cadena.length());




    }
}
