package EJ28Strings;

public class EJ28Strings {
    public static void main(String[] args) {
                /*la Clase String tiene muchas funcionalidades
            ya predifinidas en la libreria de java*/


        String miString="Franco";
            char caracter;


//charAt es para pedir cada caracter de la palabra/oracion
        caracter = miString.charAt(2);
        System.out.println("caracter en la posicion 2 es  = "+caracter);


        //metodo Concat
        String resultadoConcat= miString.concat(" Cortina ");
        System.out.println("Resultado de la concatenacion es : "+ resultadoConcat);
//Este se usa cuando queremos comparar si dos Sring son iguales  es asi,, si lo queres usar sin mayuscula
        //es con ignoreCase
        System.out.println("Estos Strings son iguales? :" + resultadoConcat.equals(miString));

    }
}
