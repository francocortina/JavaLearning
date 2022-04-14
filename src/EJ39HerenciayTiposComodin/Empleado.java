package EJ39HerenciayTiposComodin;

public class Empleado extends Persona {
    double salario;
    String email;

    //Constructor
    public Empleado(double salario, String email, String name, int edad){
        super (name,edad);

    this.salario=salario;
    this.email=email;


    }

}
