package EJ3introduccionCaracteres;
//importamos a la clase scanner para usarla
import java.util.Scanner;

public class IntroduccionCaracteres {
    public static void main(String[] args) {
       /*creamos un objeto de tipo scanner*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Como te llamas?");
        //declaramos la variable que usará la clase scanner
        String nombre= scanner.nextLine();
        System.out.println("Bienvenido :"+nombre+"!");
        System.out.println("Qué edad tienes?");
        int edad = scanner.nextInt();

        if(edad > 18){
            System.out.println("Eres mayor");
        }else{
            System.out.println("acceso prohibido");
        }}

}
