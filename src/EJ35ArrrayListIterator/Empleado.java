package EJ35ArrrayListIterator;

public class Empleado {

    String name;
    int edad;
    double salario;


    //constructor

    Empleado(String name, int edad, double salario){
        this.name=name;
        this.edad=edad;
        this.salario=salario;

    }

    //Metodos

    public String DameDatos(){

return "Nombre empleado : "+ name + " Edad del empleado: "+edad+ " Salario del Empleado:"+salario ;

    }

   public String getName(){
        return name;
    }

    public void setName(String name){

        this.name=name;
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
