package EJ51AccesoBD;
import java.sql.*;


public class Coneccion {
    public static void main(String[] args) {

        try{
            //1 Crear la conexion
    Connection miConeccion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
    //2 Crear el objeto tipo Statement para enviar consultas a la base de datos
            Statement miStatement= miConeccion.createStatement();
     //3 Ejecutar SQL CON EL OBJETO TIPO STATEMENT
     ResultSet result= miStatement.executeQuery("SELECT * FROM productos");
     //4 Recorrer el ResultSet con uno de los metodos que te propporciona la interfaz
            while(result.next()){
                System.out.println(result.getString("nombre")+" "+result.getString("descripcion")+" "+result.getString("precio"));


            }


        }catch (Exception e){

            System.out.println("Error con la conexion" );
            e.printStackTrace();
        }



    }
}
