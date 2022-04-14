package EJ43ColeccionIteradores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {

        Set<Cliente> clientesBanco= new HashSet<Cliente>(25);

        Cliente cli1= new Cliente("Franco", 1,35000);
        Cliente cli2= new Cliente("Franco", 2,35000);
        Cliente cli3= new Cliente("Franco", 3,35000);
        Cliente cli4= new Cliente("Franco", 4,35000);
        Cliente cli5= new Cliente("Franco", 5,35000);
        Cliente cli6= new Cliente("Franco", 6,35000);
        Cliente cli7= new Cliente("Franco", 7,35000);
        Cliente cli8= new Cliente("Franco", 8,35000);

        clientesBanco.add(cli1);
        clientesBanco.add(cli2);
        clientesBanco.add(cli3);
        clientesBanco.add(cli4);
        clientesBanco.add(cli5);
        clientesBanco.add(cli6);
        clientesBanco.add(cli7);
        clientesBanco.add(cli8);

       /* for (Cliente e:
             clientesBanco) {
            System.out.println(e.getN_cuenta());
        }*/

       /* //Creamos el objeto iterador
        Iterator<Cliente> it=clientesBanco.iterator();
        while(it.hasNext()){
            //Para obtener el nombre priemro debo saltar la posicion para que me lo de

            System.out.println( it.next().getNombre());
          //Solo te imprime el dato nombre  sino si usas de denuevo next te imprimiria el dato pedido dekl otro elemento
        }*/

        ///noo te deja remover all mismo tiempo que la recorres
       /* for (Cliente e:
             clientesBanco) {
                if(e.getN_cuenta()==4){
                    System.out.println(e+"Removido");
                    clientesBanco.remove(e);


                }

        }

        for (Cliente e:
                clientesBanco) {
            System.out.println(e.getN_cuenta());
        }*/


        Iterator<Cliente> it= clientesBanco.iterator();

        while (it.hasNext()){
            int num= it.next().getN_cuenta();

            if (num==4){
                //TIENE SU REMOVE
                it.remove();

            }

        }


        for (Cliente c:
             clientesBanco) {
            System.out.println("NUM:"+c.getN_cuenta());
        }

    }


}
