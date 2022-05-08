package EJ52RepasoRecorridos;

import java.util.Comparator;

public class Alumno extends Persona {
    int dni;

    //Constructor
    public Alumno(String nombre, String apellido, int dni){
        super(nombre,apellido);
       this.dni=dni;


    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


}
