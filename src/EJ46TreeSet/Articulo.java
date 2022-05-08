package EJ46TreeSet;
/*La clase debe implementar la interfaz comparable*/
public class Articulo  implements Comparable<Articulo>{
    private int num;
    private String nombre;

    //Constructor
    Articulo(int num, String nombre){
        this.nombre=nombre;
        this.num=num;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Este es el metodo compare para ordenar el TreeSet en cuanto mi criterio
    @Override
    public int compareTo(Articulo o) {
        return num-o.num;
    }


}
