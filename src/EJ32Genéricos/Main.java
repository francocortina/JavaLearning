package EJ32Genéricos;

public class Main {

    public static void main(String[] args) {
        /*Es una clase donde el tipo de atributo de la
        variable de instancia no me jode, lo defino yo en instancia*/

        Caja<String> caja1= new Caja<>("Hola");

        //No acepta datos de tipo primitivo por los que se usa las clases que te da Java
        //Integer y String te las da java, sino serian string y int
        Integer numero = 5;
        Caja<Integer> caja2= new Caja<>(numero);
        String elemento1 = "Perro";

        System.out.println("La variable caj1 contiene un objeto de la misma clase que mi objeto?"+ caja1.perteneceElContenidoALaMismaClase(elemento1));
        System.out.println("La variable caj1 contiene un objeto de la misma clase que mi objeto?"+ caja2.perteneceElContenidoALaMismaClase(elemento1));
    }
}
