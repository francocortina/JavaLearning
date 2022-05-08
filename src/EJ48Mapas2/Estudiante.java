package EJ48Mapas2;


import java.util.Date;

public class Estudiante implements Comparable<Estudiante>{
private String nombre;
private int id;
private Date fechadeingreso;

//Constructor
    Estudiante(String nombre, int id, Date fechadeingreso ){
        this.nombre=nombre;
        this.id=id;
        this.fechadeingreso=fechadeingreso;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(Date fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String toString(){
        return "[nombre: "+nombre+" id: "+id+" fecha de ingreso: "+ fechadeingreso+"]";

    }

    @Override
    public int compareTo(Estudiante o) {
        return id-o.id;
    }
}

