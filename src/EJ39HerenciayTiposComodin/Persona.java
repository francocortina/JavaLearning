package EJ39HerenciayTiposComodin;

import java.lang.reflect.Constructor;

public class Persona {
    private String name;
    private int edad;

   // Constructor
          public  Persona (String name, int edad){
               this.name=name;
                this.edad=edad;

           }

//Metodos

    public String getName(){

               return name;
    }

    public void setName(String name){
               this.name=name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
