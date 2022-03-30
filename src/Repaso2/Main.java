package Repaso2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBanco Franco= new CuentaBanco("franco", "cortina", 24,"franco@gmail.com", 350000,TipoDeCuenTa.AHORRO );
int option;

    do {

        Scanner sacanner = new Scanner(System.in);
        System.out.println("Ingrese consulta");
        System.out.println("0-para salir");
        System.out.println("1 - para ingresar dinero");
        option= sacanner.nextInt();
        switch (option){


        case 1:
            System.out.println("Ingrese cantidad");
            double monto= sacanner.nextDouble();
            Franco.Ingresarsaldo(monto);
            System.out.println("Su saldo actual es" + Franco.getSaldo());
            break;
            default:
                System.out.println("vuelva a intenntarlo");
                break;
    }



    }while(option != 0 );



//solo para practicar problemas
    int num1= 4;
    int num2= 24;

    int suma=num1+num2;
        System.out.println("L a suma es"+suma);
        num2=14;
    Franco.sumar(num1,num2);

    }
}
