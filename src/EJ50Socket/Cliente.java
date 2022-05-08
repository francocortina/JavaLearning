package EJ50Socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {

        //Instancio la lamina
        MarcoCliente mimarco= new MarcoCliente();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }}

class MarcoCliente extends JFrame {

    public MarcoCliente(){
///Defino las propiedades css del panel
            setBounds(600,300,280,350);
            LaminaMarcoCliente milamina= new LaminaMarcoCliente();
            add(milamina);
            setVisible(true);

        }}

        class LaminaMarcoCliente extends JPanel{
            private JTextField campo1;
            private JButton miboton;

            public LaminaMarcoCliente(){
                //Ingreso los elementos
                JLabel texto= new JLabel("Cliente");
                add(texto);
                campo1=new JTextField(20);
                add(campo1);
                miboton= new JButton("Enviar");
                EnviaTexto mievento= new EnviaTexto();
                miboton.addActionListener(mievento);
                add(miboton);

            }

            //Creo el evento del botón
            private class EnviaTexto implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent e) {
                   // System.out.println(campo1.getText());
                    //Creo el socket
                    try {
                        //ESTE ES EL IP AL QUE SE TRASLADARÁ, ip y puerto
                        //Como lo estoy haciendo local pongo el mio y meto cualquier puerto que no este en uso
                        Socket misocket= new Socket("192.168.1.49",9999);
                        //Flujo de datos de salida
                        DataOutputStream flujo_salida=new DataOutputStream(misocket.getOutputStream());
                            /*En el fluijo de datos de sallida va a viajar el texto del campo uno que circulara por el socket y terminara en el servidor*/
                        flujo_salida.writeUTF(campo1.getText());
                        flujo_salida.close();
                        //Terminamos la parte de la coneccion pero ahora me tengo que ir al servidor para quue me abra el puerto 9999
                    } catch (IOException ex) {
                        //asi se pone pra que te salga cual fue el error
                        System.out.println(ex.getMessage());
                    }
                }
            }

        }








