package EJ12Sentenciaif;

import java.util.Scanner;

public class Sentenciaif {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese num2: ");
        int num2 = scanner.nextInt();

        if (num1==num2){

            System.out.println("Los numeros son iguales");
            if(num1<=3) {
                System.out.println("num introducido menor que 3");
                num1++;
                System.out.println("Lo incrementamos en 1 = "+num1);

            }else{
                System.out.println("numero introducido mayor a 3");
            }
        }else{
            System.out.println( "Los numeros son diferentes");
        }
    }
}
