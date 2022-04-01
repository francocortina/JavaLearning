package EJ36ArraylistGenerico1;

public class Main {

    public static void main(String[] args) {
        ArrrayGenerico Array1= new ArrrayGenerico(4);
        String nombre= "Franco";
        Array1.add(nombre);
        Array1.add(4);
        Array1.add(4.5);


        for (int i = 0; i < 4; i++) {
            System.out.println(Array1.getElemento(i));
        }

    }
}
