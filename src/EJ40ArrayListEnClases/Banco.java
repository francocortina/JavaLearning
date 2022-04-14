package EJ40ArrayListEnClases;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Empleado> arrayDeEmpleados;
    //Constructor

    public Banco(ArrayList<Empleado>listEmpleados){
        this.arrayDeEmpleados=listEmpleados;

    }
public void recorrerLista(){

    for (Empleado e:
            arrayDeEmpleados) {
        System.out.println("Nombre: "+ e.getNombre()+ "Edad"+e.getEdad()+" Salario: "+ e.getSalario()) ;
    }


}

public void AgregarEmpelado(Empleado emp){
    arrayDeEmpleados.add(emp);



}




}
