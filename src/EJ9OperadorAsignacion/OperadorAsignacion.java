package EJ9OperadorAsignacion;

public class OperadorAsignacion {
    public static void main(String[] args) {
        int a,b,c;
        a=b=c=8;
        System.out.println("a que es igual a o b o c= "+(a=b=c) );
        int x= 10;
        x=x+3;
        System.out.println("x es =" +x );
    int y= 10;
    //abreviacion de lo mismo que hice con la x
        y+= 3;
        System.out.println("Y es = "+ y);
    }
}
