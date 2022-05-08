package EJ53Excepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IngresodeDatosExcepciones {
    public static void main(String[] args) {
        System.out.println("Qué desea hacer?");
        System.out.println("1-Introducir datos ");
        System.out.println("2-Salir del programa");
        Scanner scanner= new Scanner(System.in);
        int opt= scanner.nextInt();

        if (opt==1){
try {

    Pedirdatos();
}catch (Exception e){
    System.out.println("¿Que demonios haz introducido?");

}
        }else{
            System.out.println("Adios");

        }


    }

    static void Pedirdatos()throws InputMismatchException {
        //try{

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre= scanner.nextLine();

        System.out.println("Ingrese su edad "+nombre);
        int edad= scanner.nextInt();

        System.out.println("Bienvenido "+ nombre+" el año que viene tendrás "+(edad+1)+ " años" );

        scanner.close();
   // }

       // catch (InputMismatchException e){
            //Esto hace que el programa no se caiga pero no es uan buena práctica
            //System.out.println("Qué demonios has introducido");
       // }
        System.out.println("Hemos terminado");


    }



}
