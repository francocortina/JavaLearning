package EJ34PracticaArrays;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    //Constructorde objetos de tipo empleados

    Empleado(String nombre, int edad, double salario){
        this.nombre= nombre;
        this.edad= edad;
        this.salario= salario;
    }


    //Cuando necesito que me devuelva algo pongo el tipo de dato a devolver
   public String DameLosDatos(){

        return " Nombre del empleado:   "+ nombre+ " Edad del empleado: "+edad+
                " Salario del Empleado: "+ salario;

   }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
