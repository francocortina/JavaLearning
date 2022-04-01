package EJ35ArrrayListIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> Empleados= new ArrayList<Empleado>();
        Empleados.ensureCapacity(20);

        Empleado emp1= new Empleado("Franco",24,35000);
        Empleado emp2= new Empleado("Carolina",24,35000);
        Empleado emp3= new Empleado("Melo",24,35000);
        Empleado emp4= new Empleado("Manu",24,35000);
        Empleado emp5= new Empleado("Vicky",24,35000);
        Empleado emp6= new Empleado("Hernesto",24,35000);
        Empleado emp7= new Empleado("Micaela",24,35000);
        Empleado emp8= new Empleado("Fausto",24,35000);
        Empleado emp9= new Empleado("Minerva",24,35000);
        Empleado emp10= new Empleado("Moreno",24,35000);

        Empleados.add(emp1);
        Empleados.add(emp2);
        Empleados.add(emp3);
        Empleados.add(emp4);
        Empleados.add(emp5);
        Empleados.add(emp6);
        Empleados.add(emp7);
        Empleados.add(emp8);
        Empleados.add(emp9);
        Empleados.add(emp10);

        /*for (Empleado e:
             Empleados) {
            System.out.println(" "+e.DameDatos());
        }*/

        Iterator<Empleado> mi_iterador= Empleados.iterator();
        //hasNext pregunta si tiene elementos
        //while tenga elementos
        while(mi_iterador.hasNext()){
            //Como son de tipo empleados podes usar sus metodos
            System.out.println(mi_iterador.next().DameDatos());
        }



    }
}
