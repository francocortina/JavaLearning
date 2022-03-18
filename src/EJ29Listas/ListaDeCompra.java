package EJ29Listas;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaDeCompra {

    public static void main(String[] args) {
        //Declaracion de arraylist
        ArrayList<String> miListaDeCompra = new ArrayList<String>();
        miListaDeCompra.add("Patatas");
        miListaDeCompra.add("Leche");
        miListaDeCompra.add("Huevo");
        System.out.println("Mi lista contiene:"+ miListaDeCompra);

        for (String palabra:miListaDeCompra ) {

            System.out.println("Lista:"+palabra);

        }

        ArrayList<String> miListaEneroo = new ArrayList<>(miListaDeCompra);
        miListaEneroo.add("Harina");
        System.out.println("MilistaCompra:"+miListaDeCompra+"MilistaEnero: "+ miListaEneroo);
//Primer elemento de la lista
        System.out.println("Mi primer eleemnto de la lista de compra en enero es "+ miListaEneroo.get(0));

        //Modificar  .set(posicion, value);
        miListaEneroo.set(1,"Leche entera");
        System.out.println("Segundo elemento de la llista enero: "+miListaEneroo.get(1));

        //eliminar elementos con metodo .remove(posicion)
        miListaEneroo.remove(0);
        System.out.println("Lista enero:"+ miListaEneroo);
        //Eliminar por objeto
        miListaEneroo.remove("Leche entera");
        System.out.println("Lista enero: "+ miListaEneroo);

        //Pedir el tamaño de la lista .size
        miListaEneroo.add("Manzanas");
        System.out.println("Cantidad de elementos de la lista enero: "+ miListaEneroo.size());

        //Ordenarla alfabeticamente
        Collections.sort(miListaEneroo);
        System.out.println("Lista de enero ordenada alfateticamente:"+ miListaEneroo);
        for (String entero: miListaEneroo) {
            System.out.println("Lista: "+entero);

        }





    }
}
