package EJ13Switch;

import java.util.Scanner;

public class EstructuraSwitch {



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
            System.out.println("Elija su consulta: ");
            System.out.println( " 1 para consultar su saldo");
            System.out.println( " 2 para ingresar dinero");
            System.out.println(" 3 para sacar dinero");
            System.out.println( " 4 para consultar sus ultimos movimientos");
            Scanner scanner= new Scanner(System.in);
            int opcion= scanner.nextInt();
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
            }
            System.out.println("Fuera del case");
        }
    }


