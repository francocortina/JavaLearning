package EJ6OperadoresAritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese numero 2: ");
        int num2= scanner.nextInt();

        double multiplicacion= num1*num2*2.7;

        int suma= num1+num2;
        System.out.println("La suma es = "+ suma +"  "+ "La Multiplicación de estos * 2.7 es="+multiplicacion);
        int div= num1/num2;
        System.out.println("Division:  "+div);

        /*Para que me haga la cuenta exacta debo transformar uno en double */
        double divi= (double)num1/num2;
        System.out.println("La división exacta es= "+ divi);
        int modulo= num1%num2;
        System.out.println("El resto de la ivisión exacta es= "+ modulo);
    }

}
