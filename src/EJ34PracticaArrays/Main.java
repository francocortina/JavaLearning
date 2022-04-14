package EJ34PracticaArrays;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //Arrays comunes
        Empleado listaEmpleados[]= new Empleado[3];
        listaEmpleados[0]= new Empleado("Ana", 24, 38000);
        listaEmpleados[1]= new Empleado("Franco", 24,50000);
        listaEmpleados[2]= new Empleado("Alvaro", 24, 80000);
        //Foreach
        for (Empleado e:
             listaEmpleados) {

            System.out.println(e.DameLosDatos());

        }

        ArrayList <Empleado> Misericordia  = new ArrayList<Empleado>();


        Empleado empl1= new Empleado("Franco", 24, 50000);
        Empleado empl2= new Empleado("Vicky", 22, 80000);
        Empleado empl3= new Empleado("Eze", 22, 80000);
        Empleado empl4= new Empleado("Landa", 22, 80000);
        Empleado empl5= new Empleado("Georgina", 22, 80000);
        Empleado empl6= new Empleado("Daniela", 22, 80000);
        Empleado empl7= new Empleado("Franco", 24, 50000);
        Empleado empl8= new Empleado("Vicky", 22, 80000);
        Empleado empl9= new Empleado("Eze", 22, 80000);
        Empleado empl10= new Empleado("Landa", 22, 80000);
        Empleado empl11= new Empleado("Fernando", 24, 100000);
        // Para decirle que capacidad va a teenr tu Arraylist se usa este metodo
        //porque si no le indico que capacidad tiene ocupa mas memoria porque copia  cada vez q te pasas de los 10

        Misericordia.ensureCapacity(20);
        Misericordia.add(empl1);
        Misericordia.add(empl2);
        Misericordia.add(empl3);
        Misericordia.add(empl4);
        Misericordia.add(empl5);
        Misericordia.add(empl6);
        Misericordia.add(empl7);
        Misericordia.add(empl8);
        Misericordia.add(empl9);
        Misericordia.add(empl10);
        Misericordia.add(empl11);

ArrayList<String> lpm= new ArrayList<String>();
lpm.add("hola");
lpm.add("hello");

        for (String e:
             lpm) {
            if (e.equals("hola")){

                System.out.println(e);

            }
        }


        for (Empleado e:
             Misericordia) {
            System.out.println(e.DameLosDatos());



        }
        System.out.println( "  "+ Misericordia.size());
        //Lo hice para repasar
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.ensureCapacity(15);
        empleados.add(new Empleado("Franco",24,455555));

        for (int i = 0; i < Misericordia.size() ; i++) {
            System.out.println(Misericordia.get(i).getNombre()+" "+ Misericordia.get(i).getEdad()+" "+Misericordia.get(i).getSalario());
            System.out.println(Misericordia.get(i).DameLosDatos());
        }
        //Array comun
        int [] array23= new int [4];
        array23[3]=4;

        String arraystring[]= new String[4];
        arraystring[2]="franco";
        System.out.println(
                arraystring[2]
        );
    }
}
