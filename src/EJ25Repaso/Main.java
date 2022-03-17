package EJ25Repaso;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuario;
        String  contraseña;
        String confirmacioncontraseña;
        int edad;
        String email;
        String tipo;
        int option;

        do{
            Scanner scanner= new Scanner(System.in);
            System.out.println("Menu de consulta");
            System.out.println(" 1 - Registrarse");
            System.out.println(" 2 - Salir");
            option= scanner.nextInt();

            Metodos metodos= new Metodos();

            switch (option){
                case 1:
                    System.out.println("Ingrese nombre usuario: ");
                    usuario= scanner.next();

                    System.out.println("Ingrese contraseña: " );
                    contraseña= scanner.next();

                     System.out.println("Confirme la contraseña");
                    confirmacioncontraseña= scanner.next();
               if(Objects.equals(contraseña, confirmacioncontraseña)){
                   System.out.println("contraseña confirmada");

               }else{
                   System.out.println("contraseñas diferentes");
                   break;
               }

                    System.out.println("Ingrese edad");
                    edad= scanner.nextInt();
                    if(edad < 18 ){
                        System.out.println("Uste es menor de edad, no es posible registrarse");
                        //no me deja poner break, no me deja salir del switch
                        break;
                    }

                    System.out.println("Ingrese email");
                    email= scanner.next();

                    System.out.println("Ingrese tipo de cuenta..empresa o empleado");
                    tipo=scanner.next();

                    if(tipo.equals("empresa")){
                        Repaso Cuenta1= new Repaso(usuario, contraseña, confirmacioncontraseña,edad,email,TipodeCuenta.Empresa);
                        System.out.println("Registrado con éxito como Empresa");

                    }else{
                        Repaso Cuenta1= new Repaso(usuario, contraseña, confirmacioncontraseña,edad,email,TipodeCuenta.Empleado);
                        System.out.println("Registrado con éxito como Empleado");
                    }

                    break;


            }

        }while(option != 2);

        System.out.println("Vuelva pronto");

    }

}
