package EJ30InputOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Ingresarinfo {
    public static void main(String[] args) {
        //Conectar con nuestro objeto en pc
        Path inputPath = Paths.get("C:\\Users\\Usuario\\Desktop\\pruebadeinputjava.txt");
        //copiamos el contenido en eld e arriba en otro archivo
        Path outputPatch = Paths.get("C:\\Users\\Usuario\\Desktop\\pruebadeinputjava2.txt");
        //Guardar el objeto en una variable
        InputStream input;
        //metodo estatico para crear el objeto y abrirlo en modo lectura
        try {
          InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
          //EN CASO DE QUE EL ARCHIVO SELECCIONADO NO EXISTA ESTA OPTION LO CREA
          Files.newOutputStream(outputPatch, StandardOpenOption.CREATE);
            OutputStream outputStream =  Files.newOutputStream(outputPatch, StandardOpenOption.WRITE);

        int i;
        byte[] data = new byte[1024];
        while((i = inputStream.read(data))!= -1){
outputStream.write(data);//Escribimos los datos leidos del fichero de entrada
        }
        inputStream.close();
        outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Algo paso");
        }

    }
}
