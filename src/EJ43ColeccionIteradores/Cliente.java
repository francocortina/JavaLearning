package EJ43ColeccionIteradores;

import java.util.Objects;

public class Cliente {
    String nombre;
    int n_cuenta;
    double saldo;

    //Constructor

   public  Cliente(String nombre, int n_cuenta, double saldo){
       this.nombre=nombre;
       this.n_cuenta=n_cuenta;
       this.saldo=saldo;
   }

   //Metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getN_cuenta() == cliente.getN_cuenta();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getN_cuenta());
    }
}
