package EJ45PaisesLinkedList;

import java.util.LinkedList;

public class Listaenlazada {
    public static void main(String[] args) {
        LinkedList<Pais>PiaisyCapital= new LinkedList<Pais>();
            Pais p1= new Pais("Argentina", new Capital("caba"));
            Pais p2= new Pais("España", new Capital("Madrid"));

        PiaisyCapital.add(p1);
        PiaisyCapital.add(p2);

        for (Pais p:
             PiaisyCapital) {
            System.out.println("Pais: "+p.getNombre()+ "  Capital:"+ p.capital.getNombre() );
        }


    }
}
