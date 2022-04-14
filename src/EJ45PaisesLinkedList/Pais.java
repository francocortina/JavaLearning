package EJ45PaisesLinkedList;

public class Pais {
    String nombre;
    Capital capital;



    //Constructor
    public Pais(String nombre, Capital capital){

        this.nombre=nombre;
        this.capital=capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}
