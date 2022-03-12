package EJ7OperadoresRelacionales;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        boolean num= 1>2;
        System.out.println("Es cierto que 1 es mayor que 2:  "+num);

        boolean num2= 1.7<2.5;
        System.out.println("Es cierto que 1,7 es menor que 2,5: "+ num2);
        boolean num3= 1<=2.5;
        System.out.println("Es cierto que 1 es menor o igual que 2,5: "+ num3);
        boolean num4= 2.4==2.5;
        System.out.println("Es cierto que 2.4 es igual que 2,5: "+ num4);
        boolean num5= 2.5 !=2.5;
        System.out.println("Es cierto que 2.5 es diferente que 2,5: "+ num5);

        String perro= "perro";
        String gato= "gato";

        System.out.println("¿Es cierto que perro es igual a gato?: " + perro==gato);


    }
}
