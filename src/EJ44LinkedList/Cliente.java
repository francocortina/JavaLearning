package EJ44LinkedList;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private int N_cuenta;
    private double saldo;


    //Coonstructor

    public Cliente (String nombre,int N_cuenta,double saldo){
        this.nombre=nombre;
        this.N_cuenta=N_cuenta;
        this.saldo=saldo;
    }


    //Metodos

    public int getN_cuenta(){

        return N_cuenta;
    }
    public void setN_cuenta(int N_cuenta){
        this.N_cuenta=N_cuenta;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
