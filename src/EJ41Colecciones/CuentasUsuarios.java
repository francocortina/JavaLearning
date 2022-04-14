package EJ41Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
      Cliente cli1= new Cliente("Franco", 4005546,450000);
      Cliente cli2= new Cliente("Vicky", 4005546,450000);
      Cliente cli3= new Cliente("Francisco", 4005546,450000);
      Cliente cli4= new Cliente("Miguel", 4005546,450000);
      Cliente cli5= new Cliente("Taru", 4005546,450000);
      Cliente cli6= new Cliente("Nico", 4005546,450000);
      Cliente cli7= new Cliente("Daniela", 4005546,450000);
      Cliente cli8= new Cliente("Gerogina", 4005546,450000);
      Cliente cli9= new Cliente("Marcelo", 4005546,450000);
      Cliente cli10= new Cliente("Franco", 4005546,450000);
 /*
 Preguntas que nos tenemos que hacer

 ¿Tiene sentido que en la coleccion se repitan clientes?
     RTA:no.
  *¿Muchas operaciones de agregar o borrar?
  *¿Solo lectura?

     */

        Set <Cliente> coleccioncliente= new HashSet<Cliente>();
        coleccioncliente.add(cli1);
        coleccioncliente.add(cli2);
        coleccioncliente.add(cli3);
        coleccioncliente.add(cli4);
        coleccioncliente.add(cli5);
        coleccioncliente.add(cli6);
        coleccioncliente.add(cli7);
        coleccioncliente.add(cli8);
        coleccioncliente.add(cli9);

        //no me lo concidera diferente, qué hago?
        coleccioncliente.add(cli10);


        for (Cliente c:
             coleccioncliente) {
            System.out.println("Nombre:  "+c.getNombre()+" N° Cuenta: "+c.getNumerocuenta()+" Saldo: "+ c.getSaldo());
        }


    }
}
