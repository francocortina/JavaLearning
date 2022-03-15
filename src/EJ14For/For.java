package EJ14For;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner sacanner= new Scanner(System.in);
        System.out.println("Ingrese Numero1: ");
        int num1 = sacanner.nextInt();
        for (int i = 0; i <num1 ; i++) {
            System.out.println("Entro en la iteración: " + i);


        }



    }


}
