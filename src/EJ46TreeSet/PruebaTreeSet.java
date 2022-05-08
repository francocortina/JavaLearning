package EJ46TreeSet;

import java.util.TreeSet;

public class PruebaTreeSet {
    public static void main(String[] args) {

        //Esta colleccion depende de Set y perimite ordenar a los elementos de su interior
        TreeSet<String> pruebatreeset= new TreeSet<String>();
        pruebatreeset.add("Hola");
        pruebatreeset.add("Bye");
        pruebatreeset.add("GoodBye");
        pruebatreeset.add("Hi");
        /*Orden por defecto es alfabetico*/
        System.out.println(pruebatreeset);

        //Prueba de TreeSet ordenado por el compare

        TreeSet<Articulo> articulos= new TreeSet<Articulo>();
        Articulo art1= new Articulo(0,"Pantalon");
        Articulo art2= new Articulo(1,"Remera");
        Articulo art3= new Articulo(2,"Short");
        Articulo art4= new Articulo(3,"Blusa");
        Articulo art5= new Articulo(4,"Buzo");

        articulos.add(art1);
        articulos.add(art2);
        articulos.add(art3);
        articulos.add(art4);
        articulos.add(art5);
/*Me lo imprime con el comprtamiento del Compare to, osea de menor a mayor en numero*/
        for (Articulo a:
             articulos) {
            System.out.println(a.getNombre());
            System.out.println(a.getNum());

        }
/*Podria presentarse un problema si el ordenamiento lo haces en orden Alfabetico
*Porque no se pueden crear dos metodos compare to, osea solo me sirve para la diferente tipo de clase definida
 y solo si los objetos vienen con la interfaz implementada, en el video num 187 creo q hay otra opcion*/


 //Volvimos, la forma de resolver esto está en este video(Los videos de si no implementa comparable o
        // necesitas otro comparable https://www.youtube.com/watch?v=R3I9dkj2G7I)

/*El criterio de ordenación en el TreeSet se hace poniendolo en la instanciacion luego de haber construido
*  el metodo en la clase articulo; lluego se lo instacia así en el main
*         Articulo comparadorarticulos= new Articulo();
TreeSet <Articulo> ordenarticulos= new TreeSet<Articulo>(comparadorarticulos);*/

    }
}
