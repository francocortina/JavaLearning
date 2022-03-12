package EJ8OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //AND
        System.out.println("False & False = "+ (false&false));
        //OR
        System.out.println("true | False = "+ (true|false));
        //OR circuito corto, si el primero es true ya no evalua el otro
        System.out.println("true || False = "+ (true||false));

        //XOR solo es true cuando solo uno de los dos es true,, sino es false
        System.out.println("true ^ False = "+ (true^false));
        System.out.println("true ^ true = "+ (true^true));

        //NOT, cambiael estado
        System.out.println("!False = "+ !false);
        System.out.println("!true  = "+ !true);

    }
}
