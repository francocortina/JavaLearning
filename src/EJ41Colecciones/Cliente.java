package EJ41Colecciones;

public class Cliente {
   private String nombre;
   private int numerocuenta;
   private double saldo;



    //Constructor

    Cliente(String nombre, int numerocuenta, double saldo){
        this.nombre=nombre;
        this.numerocuenta=numerocuenta;
        this.saldo=saldo;
    }

    //Metodos

    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nombre){

        this.nombre=nombre;


    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
