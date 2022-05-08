package EJ49Mapas3PracticaRecorrido;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapaAutomoviles {
    public static void main(String[] args) {
        HashMap<Integer,Automovil> concecionaria= new HashMap<Integer,Automovil>();
       Automovil aut1= new Automovil(001,"208","peugeot",new Date(),1000000);
       Automovil aut2= new Automovil(002,"208","peugeot",new Date(),1000000);
       Automovil aut3= new Automovil(003,"208","peugeot",new Date(),1000000);
       Automovil aut4= new Automovil(004,"208","peugeot",new Date(),1000000);
       Automovil aut5= new Automovil(005,"208","peugeot",new Date(),1000000);
        concecionaria.put(0,aut1);
        concecionaria.put(1,aut2);
        concecionaria.put(2,aut3);
        concecionaria.put(3,aut4);
        concecionaria.put(4,aut5);

        System.out.println(concecionaria);
/*  Video del recorrido  https://www.youtube.com/watch?v=xv4Zs1KiD8g*/
        for (Map.Entry<Integer,Automovil> a: concecionaria.entrySet()
             ) {
            System.out.println(a.getValue()+" "+a.getKey());
        }
        //seria un set el replace
        Automovil aut6= new Automovil(006,"208","peugeot",new Date(),1000000);
        concecionaria.replace(1,aut6);

        for (Map.Entry<Integer,Automovil> a: concecionaria.entrySet()
        ) {
            System.out.println("");
            System.out.println(a.getValue()+" "+a.getKey());
        }



    }
}
