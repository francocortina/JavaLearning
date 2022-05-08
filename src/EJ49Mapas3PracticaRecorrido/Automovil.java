package EJ49Mapas3PracticaRecorrido;

import java.util.Date;

public class Automovil {
    int codigo;
    private String modelo;
    private String marca;
    private Date fechaIngreso;
    private double precio;

    //Constructor
    public Automovil(int codigo,String modelo,String marca,Date fechaIngreso,double precio){
        this.codigo=codigo;
        this.modelo=modelo;
        this.marca=marca;
        this.fechaIngreso=fechaIngreso;
        this.precio=precio;
    }

    //Metodos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo(){

        return modelo;
    }



    public void setModelo(String modelo){

        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
public String toString(){
        return "[Codigo: " +codigo+
                " Modelo:" +modelo+
                " Marca: "+marca+
                " FechaIngreso: "+ fechaIngreso+
                "Precio:"+precio+
                "]";
}

}
