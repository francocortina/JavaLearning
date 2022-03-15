package EJ16DoWhile;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        /*Serie de instrucciones en bucle pero si o si se necesita que se ejecute una vez
        * ulilizamos bucle dowhile*/

        Scanner scanner= new Scanner(System.in);

        double num1;

        do {
            System.out.println("Introduzca un numero para salir introduzca el 0");
            num1= scanner.nextDouble();
                    if(num1==0){
                System.out.println("GoodBye");

            }else  {
                System.out.println("la raiz cuadrada de "+num1+"es = "+ Math.sqrt(num1));
            }
        }while(num1 !=0);
    }
}
