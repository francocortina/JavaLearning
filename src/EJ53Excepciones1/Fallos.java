package EJ53Excepciones1;


import javax.swing.*;

import java.io.IOException;
import java.util.Scanner;

/*Existen
* Errores de tipo sintaxis
* Errores en tiempo de ejecucion (IOExceptions- excepcion comprobada , RuTimeException - Excepciones no comprobadas)
*las clases de errores en tiempo de ejcuciion sirven para que la calse agarre el error y pueda ejecutar la otra parte del codigo
* */
public class Fallos {
    public static void main(String[] args) {
        //EJEMPLO DE ERRORES EN EJECUCUION
        //MATRIZ DE 5 PERRO INGRESO 6 VALORES
        int [] mi_matriz= new int[5];
        mi_matriz[0]= 24;
        mi_matriz[1]= 115;
        mi_matriz[2]= 14;
        mi_matriz[3]= 65;
        mi_matriz[4]= 30;
        //mi_matriz[5]= 30; si inggreso esta demas me tirara un error ArrayIndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException -Clase a la que pertenece el error

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Posicion: "+i+" Numero:"+mi_matriz[i]);
        }
//Peticion
        //La clase JOptionPane.showInputDialog("Introduce tu nombre")
        //DESPLEAGA UNA VENTANA DE INPUT PARA INGRESAR ALGO

        String nombre= JOptionPane.showInputDialog("Introduce tu nombre");
        //En el caso de integer hay que pasarlo porque ingresa por determinado String

        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));


        System.out.println("Hola "+nombre+ " tienes"+ edad+ "años");



    }




}
