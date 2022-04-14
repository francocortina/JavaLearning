package EJ38ArraylistenClase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Banco banco= new Banco(new ArrayList<>());
        Empleado empleado1= new Empleado("Franco",24);
        Empleado empleado2= new Empleado("Vicky",24);
        Empleado empleado3= new Empleado("Milei",24);

        banco.empleados.add(empleado1);
        banco.empleados.add(empleado2);
        banco.empleados.add(empleado3);
        System.out.println(banco.getEmpleados());







    }
}
