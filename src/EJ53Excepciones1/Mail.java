package EJ53Excepciones1;

import javax.swing.*;
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
 /*   try {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num1= scanner.nextInt();
    }catch (Exception e){
        System.out.println("No es un numero");

    }*/
String mail= JOptionPane.showInputDialog("Introduce el mail");

examinaMail(mail);


    }

    static void examinaMail(String mail){
        /*Ncesito una variable para busdcar al  arroba y otra para el punto*/
        int arroba=0;
        boolean punto=false;
       /*El charArt es para buscar por posicion la letra*/

        for (int i = 0; i < mail.length(); i++) {

            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                    punto=true;

            }


        }
        if(arroba==1 && punto==true ){
            System.out.println("Es correcto: "+ mail);

        }else{
            System.out.println("No es correcto");
        }


    }
}
