package EJ50Socket;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


class MarcoJframe extends JFrame implements Runnable {
    private  JTextArea texto;
    public MarcoJframe(){

        setBounds(1200,300,280,350);
        JPanel milamina= new JPanel();
        milamina.setLayout(new BorderLayout());
       texto= new JTextArea();
        milamina.add(texto,BorderLayout.CENTER);
        add(milamina);
        setVisible(true);
        /*Construccion del hilo*/
        //Creamos el hilo inicializando la instancia
        Thread mihilo= new Thread(this);
        mihilo.start();

    }
//Metodo que aparece por la implementacion de Runnable
    //Luego agrego yo lo de adentro
    @Override
    public void run() {
        /*Construccion de ServerSocket para poner la aplicacion a la escucha en un puerto indicado */
        try {
            ServerSocket servidor= new ServerSocket(9999);
            while(true){ /*Luego hay que decirle que acepte la aplicacion del exterior */
                Socket misocket= servidor.accept();
                /*Luego hay que crear un input que me capte el flujo que viaja a esta aplicacion*/
                DataInputStream flujo_entrada= new DataInputStream(misocket.getInputStream());
                /*Luego hay que leerlo yy almacenarlo en una variable*/
                String mensajeTexto=flujo_entrada.readUTF();
                /*Luego hay que hacer que lo escriba en ti JTextarea*/
                texto.append("\n"+ mensajeTexto);
                /*Cerramos la conexion*/
                misocket.close();}


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
/*Este servidor va a tener que recibir el tesxto desde el clliente y por otro lado la segunda tarea
* sera permanecer a la escucha con el puerto 9999 abierto utilizando los hilos--threads*/
public class Servidor  {
    public static void main(String[] args) {
MarcoJframe servidor= new MarcoJframe();
   servidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}