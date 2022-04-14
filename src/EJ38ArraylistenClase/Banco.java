package EJ38ArraylistenClase;

import java.util.ArrayList;

public class Banco {


    ArrayList<Empleado>empleados;

    //Coonstructor
    Banco(ArrayList<Empleado> empleados){
        this.empleados=empleados;
    }


    public String getEmpleados() {
        for (Empleado e:
             empleados) {
            System.out.println(e.getName());

        }
return "";
    }





    }

