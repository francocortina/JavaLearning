package EJ44LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class cuentasCllientes {
    public static void main(String[] args) {

        /*Lo que diferencia la lista linkedlist a la de arraylist es que es mas eficiente
        si tenes q eliminar alguno y es ordenada*/
        Cliente cli1= new Cliente("franco",4,25000);
        Cliente cli2= new Cliente("franco",5,25000);
        Cliente cli3= new Cliente("franco",6,25000);
        Cliente cli4= new Cliente("franco",7,25000);
        Cliente cli5= new Cliente("franco",8,25000);
        Cliente cli6= new Cliente("franco",9,25000);

        LinkedList<Cliente> linkedclientes= new LinkedList<Cliente>();


        linkedclientes.add(cli1);
        linkedclientes.add(cli2);
        linkedclientes.add(cli3);
        linkedclientes.add(cli4);
        linkedclientes.add(cli5);
        linkedclientes.add(cli6);
        //mas metodos que la del set
        ListIterator<Cliente> itlinked= linkedclientes.listIterator();
        while(itlinked.hasNext()){
            int cuenta=itlinked.next().getN_cuenta();
           if(cuenta==6){
               itlinked.remove();

           }else{

               System.out.println("Iterador Linked:"+cuenta);
           }


        }



        Iterator<Cliente> it = linkedclientes.iterator();
        while(it.hasNext()){
            int cuenta= it.next().getN_cuenta();
            System.out.println("cuenta cliente por iterador: "+cuenta);

        }



        LinkedList<String> listadestring= new LinkedList<String>();

        listadestring.add("Franco");
        listadestring.add("Manuel");
        listadestring.add("Miguel");
        listadestring.add("Mica");

        for (String s:
             listadestring) {
            System.out.println(s);
        }






    }





}
