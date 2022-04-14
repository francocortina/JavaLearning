package EJ42Colecciones2;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UsoLibros {
    public static void main(String[] args) {

        Set<Libro> libreria= new HashSet<Libro>();

        Libro lib1= new Libro("Franco","Cortazar",1234);
        Libro lib2= new Libro("Frodo","Cortar",1111);
        Libro lib3= new Libro("Señor de los Anillos","Cortazar",1112);
        Libro lib4= new Libro("Chino mandarin","Cortazar",1121);
        Libro lib5= new Libro("Coco","Cortazar",1122);
        Libro lib6= new Libro("Samba","Cortazar",1211);
        Libro lib7= new Libro("Dracula","Cortazar",1212);
        Libro lib8= new Libro("Dracula","Cortazar",1212);

        libreria.add(lib1);
        libreria.add(lib2);
        libreria.add(lib3);
        libreria.add(lib4);
        libreria.add(lib5);
        libreria.add(lib6);
        libreria.add(lib7);
        libreria.add(lib8);

        for (Libro l:
             libreria) {
            System.out.println(l.getTodo());
        }
        
        
        
        if (lib7.getAutor()==lib2.getAutor()){
            System.out.println(lib1.hashCode());
            System.out.println("Son iguales ==");
        }else  {
            //Referencia de posicion de los eleementos
            System.out.println(lib7.hashCode());
            System.out.println(lib2.hashCode());
            System.out.println("no son lo mismo ==");
        }

        if (Objects.equals(lib7.getISBN(), lib8.getISBN())){
            System.out.println("son iguales  very good, equals");
        }
        //Si querremos sin los getter o setters podemos sobreescribit el metodo equals solo
        //aplicando generate en los metodos.

        if (lib7.equals(lib8)){
            System.out.println("Overwrite del equals");

        }









        ArrayList<String> pruebaigual= new ArrayList<String>();
        pruebaigual.add("franco");
        pruebaigual.add("cdcd");

        for (String e:
             pruebaigual) {
            if (e=="cdc"){
                System.out.println("son iguales");

            }
            else {
                System.out.println(e);
            }
        }

        for (String e:pruebaigual
             ) {
            if (e.equals("cdc")){
                System.out.println("son iguales");

            }
            else {
                System.out.println(e);
            }

        }




    }
}
