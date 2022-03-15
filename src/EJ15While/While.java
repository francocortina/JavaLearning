package EJ15While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca numero para realizar su raiz cuadrada ");
        double num1= scanner.nextDouble();
        double num2= 0.0;
        while (num2*num2< num1){
            num2 += 0.01;
            System.out.println("sera la raiz cuadrada de "+num1+"=  "+num2);
        };
        num2 -= 0.01;
        System.out.println("La raiz cuadrada que hemos calculado es= "+ num2);
        System.out.println("La verdadera raiz cuadrada es "+ Math.sqrt(num1));
    }
}
