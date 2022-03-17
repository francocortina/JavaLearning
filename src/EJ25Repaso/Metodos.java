package EJ25Repaso;

public class Metodos {

    //Metodos del Registro
    void Validar(String contraseña,String confirmacioncontraseña ){
        if (contraseña == confirmacioncontraseña){
            System.out.println("Contraseña confirmada");

        }else{
            System.out.println("Contraseñas diferentes");
            //no me deja poner break, no me deja salir del switch

        }
    }

    void validar (int edad){
        if(edad < 18 ){
            System.out.println("Uste es menor de edad, no es posible registrarse");
    //no me deja poner break, no me deja salir del switch
        }

    }
}
