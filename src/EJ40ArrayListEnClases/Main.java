package EJ40ArrayListEnClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese Usuario: ");
        String p1= scanner.next();
        System.out.println("Ingrese contraseña: ");
        String p2= scanner.next();


        Banco banco= new Banco(new ArrayList<Empleado>());

        Empleado emp1= new Empleado("franco",24,2444.55);
        Empleado emp2= new Empleado("cxvxc",24,2444.55);
        Empleado emp3= new Empleado("bnnb",24,2444.55);
        Empleado emp4= new Empleado("fsdfsdo",24,2444.55);
        Empleado emp5= new Empleado("fsdfsd",24,2444.55);
        Empleado emp6= new Empleado("fsdf",24,2444.55);
        Empleado emp7= new Empleado("ggggho",24,2444.55);
        Empleado emp8= new Empleado("fds",24,2444.55);
        Empleado emp9= new Empleado("asas",24,2444.55);

        banco.AgregarEmpelado(emp1);
        banco.AgregarEmpelado(emp2);
        banco.AgregarEmpelado(emp3);
        banco.AgregarEmpelado(emp4);
        banco.AgregarEmpelado(emp5);
        banco.AgregarEmpelado(emp6);
        banco.AgregarEmpelado(emp7);
        banco.AgregarEmpelado(emp8);
        banco.AgregarEmpelado(emp9);


        banco.recorrerLista();



    }
}
