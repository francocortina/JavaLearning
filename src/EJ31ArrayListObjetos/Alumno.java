package EJ31ArrayListObjetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno {
    String nombre;
    String apellido;
    int dni;
    int edad;
    int lu;
    Date fechaNacimiento;

    //constructor alumno

    Alumno(String nombre, String apellido, int dni, int edad, int lu, Date fechaNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
        this.lu=lu;
        this.fechaNacimiento=fechaNacimiento;

    }

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String formatearFecahDeNacimiento(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada= sdf.format(fechaNacimiento);
        return fechaFormateada;

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
