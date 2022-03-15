package EJ17Interfazcompleta;

import java.util.Scanner;

public class IntefazCompleta {



    /*
    * Programa  que emula la interfaz de un cajero aotomático.*
     El programa presentará las siguientes  opciones al usuario
    Elija una de las siguientes opciones:
    1 para consultar su saldo
    2 para ingresar dinero
    3 para sacar dinero
    4 para consultar sus ultimos movimientos
     */


    public static void main(String[] args) {

        int saldo= 350;
        int opcion;
        Scanner scanner= new Scanner(System.in);


        do{
            System.out.println("Elija su consulta: ");
            System.out.println( " 1 para consultar su saldo");
            System.out.println( " 2 para ingresar dinero");
            System.out.println(" 3 para sacar dinero");
            System.out.println( " 4 para consultar sus ultimos movimientos");
            System.out.println( " Para salir ingrese un numero diferente de las opciones");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo actual es: "+ saldo);
                    break;
                case 2:
                    System.out.println("Ingrese cantidad de dinero: ");
                    int dinero= scanner.nextInt();
                    saldo= saldo+dinero;
                    System.out.println("Su saldo actual es de: "+saldo);
                    break;
                case 3:
                    System.out.println("Ingrese monto a sacar: ");
                    int monto= scanner.nextInt();
                    if(monto > saldo) {
                        System.out.println("Saldo insuficiente");
                        break;
                    }else{
                        saldo= saldo-monto;
                        System.out.println("Saldo actual: "+saldo);
                        System.out.println("Monto retirado: "+monto);
                        break;
                    }
                default:
                    System.out.println("Muchas gracias!");
                    break;
            }}while(opcion== 1 || opcion== 2 || opcion== 3 ||opcion== 4);

        System.out.println("Gracias por su consulta");
    }
}
