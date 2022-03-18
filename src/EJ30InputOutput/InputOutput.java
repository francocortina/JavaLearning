package EJ30InputOutput;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//Este es el codigo para leer un archivo
public class InputOutput {
    public static void main(String[] args) {
        //Conectar con nuestro objeto en pc
        Path inputPath = Paths.get("C:\\Users\\Usuario\\Desktop\\pruebadeinputjava.txt");

        //Guardar el objeto en una variable
        InputStream input;
        //metodo estatico para crear el objeto y abrirlo en modo lectura
        try {
            input= Files.newInputStream(inputPath, StandardOpenOption.READ);
            //Creamos una variable que recogera la salida del metodo READ
            int i;
            while((i=input.read()) != -1){
                System.out.print((char)i);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Algo paso");
        }

    }
}
