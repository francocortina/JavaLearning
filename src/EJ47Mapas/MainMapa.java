package EJ47Mapas;

import java.util.HashMap;
import java.util.Map;


public class MainMapa {
    public static void main(String[] args) {
        //(Tipo de dato de la clave, tipo de dato de los valores)
        //Si repito las claves me remplazara el último con la misma clave y los otros no estarán mas
        HashMap<String,Empleado> Colecionmapa1= new HashMap<String,Empleado>();
        Empleado emp1= new Empleado("Franco",24,70000);
        Empleado emp2= new Empleado("Eze",24,80000);
        Empleado emp3= new Empleado("Manuel",24,40000);
        Empleado emp4= new Empleado("Victoria",24,43300);
        Empleado emp5= new Empleado("Lara",24,96000);
        Colecionmapa1.put("0",emp1);
        Colecionmapa1.put("1",emp2);
        Colecionmapa1.put("2",emp3);
        Colecionmapa1.put("3",emp4);
        Colecionmapa1.put("4",emp5);

        System.out.println(Colecionmapa1);

        //Eliminar un elemento del mapa
        Colecionmapa1.remove("0");
        System.out.println(Colecionmapa1);
        //Para sustituir el elementos solo pongo la misma clave y el valor
        Colecionmapa1.put("0",emp1);
        System.out.println(Colecionmapa1);

        //Metodo entrySet, nos devuelve una coleccion en tipo Set y nos imprime esa coleccions
        System.out.println(Colecionmapa1.entrySet());
        //Recorrer el mapa
        //Lo pasa a un Set con la interfaz antes mencionada y luego permite recorrerlo
        for (Map.Entry<String,Empleado> e: Colecionmapa1.entrySet()
             ) {

            System.out.println(e.getKey()+" Empelado: "+ e.getValue());
        }


    }
}
