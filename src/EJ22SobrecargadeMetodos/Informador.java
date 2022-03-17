package EJ22SobrecargadeMetodos;

public class Informador {
    /*Agrego constantes para los colores*/
    public static final String COLOR_PORFECETO= "\u001B[0m";
    public static final String COLOR_ROJO="\u001B[31m";
    public static final  String COLOR_AZUUL="\u001B[34m";
    public static final String COLOR_AMARILLO="\001B[33m";
    public static final String COLOR_PURPLE = "\u001B[35m";
    public static final String COLOR_CYAN = "\u001B[36m";
    public static final String COLOR_WHITE = "\u001B[37m";



/*Lo que hace esto es que podes hacer los metodos con el mismo nombre y depoendiendo
lo que ingreses o pidas usara ese metodo*/

    void mostrarporPantalla(int entero){
        System.out.println("El numero entero es"+ entero);


    }

    void mostrarporPantalla(double decimal){
        System.out.println("El decimal es : "+ decimal);


    }
    void mostrarporPantalla(String string){
        System.out.println("El string es : "+ string);


    }

    //PARA MOSTRAR UNA PALABRA CON UN COLOR SELECCIONADO
    void mostrarporPantalla(String palabra, String color){

        System.out.println(color+"La palabra es: "+ palabra+COLOR_PORFECETO);
    }


}
