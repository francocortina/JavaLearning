package EJ23CajeroAutomatico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CajeroAutomatico cuentaFran= new CajeroAutomatico("Franco","1234",TipoCuentaBancaria.AHORRO,35000);
       Scanner scanner= new Scanner(System.in);
        int option;
       do{
           System.out.println("Elija su Consulta:");
           System.out.println(" 1 - Mostrar Saldo");
           System.out.println(" 2 - Ingresar Dinero");
           System.out.println(" 3 - Sacar Dinero");
           System.out.println(" 0 - Salir");

           option= scanner.nextInt();
           switch (option){
               case 1:
                cuentaFran.mostrarSaldo();
                break;
               case 2:
                   System.out.println("Ingrese monto a depositar: ");
                   double monto= scanner.nextDouble();
                   cuentaFran.ingresarSaldo(monto);
                   break;
               case 3:
                   System.out.println("Ingrese monto a sacar: ");
                   double monto2 = scanner.nextDouble();
                   cuentaFran.sacarDinero(monto2);
                   break;
               default:
                   System.out.println("No existe esa consulta");
                   break;
            }

           }while(option !=0);
        System.out.println("Gracias por utilizar nuestro servicio");

    }

}
