package EJ11Conversor;

import java.util.Scanner;

/*Programa que permita introducir cantidad enn euuros y devolverla en dólares
* El mensaje será tanto euros equivales a tantos doalres*/
public class Conversor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros: ");
        int euro= scanner.nextInt();

        double dolar;
        dolar= (double)(euro*1.09);

        System.out.println("Convertidos son:$ "+dolar+" dolares");

/*Si queres cambiar algo a string se cambia asi*/
        String eurosString= Integer.toString(euro);


    }
}
