package EJ37ClasesGenericas1;

public class Main {
    public static void main(String[] args) {
        //Cuando es un metodo generico se lo inicializa asi
       Pareja<String> par1= new Pareja<String>("Franco");
       //Diferentes formas de instanciarlo
       Pareja par2= new Pareja("Manuel");
        Main Main= new Main("Franco");
        Main.setNombre("Manuel");
        System.out.println(par1.getElemento());
        System.out.println(Main.getNombre());
        System.out.println(par2.getElemento());

    }
    private String nombre;
    public Main(String nombre){
        this.nombre=nombre;

    }
    //metodo get/set
    public String getNombre(){

        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
}


