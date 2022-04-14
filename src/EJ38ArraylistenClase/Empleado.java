package EJ38ArraylistenClase;

public class Empleado {


    private String name;
    private int age;
    private double salario;

    //Constructor
    Empleado(String name, int age){
        this.name=name;
        this.age=age;

    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
