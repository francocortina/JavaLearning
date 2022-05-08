package EJ48Mapas2;

import java.util.*;

public class Mapaestudiantes {
    public static void main(String[] args) {
        //Map
        HashMap<String,Estudiante> listaestudiantes= new HashMap<String,Estudiante>();
        Estudiante est1= new Estudiante("franco",0,new Date());
        Estudiante est2= new Estudiante("Manu",1,new Date());
        Estudiante est3= new Estudiante("Eze",2,new Date());
        Estudiante est4= new Estudiante("Vicky",3,new Date());
        Estudiante est5= new Estudiante("Ezequiel",4,new Date());

        listaestudiantes.put("1",est1);
        listaestudiantes.put("2",est2);
        listaestudiantes.put("3",est3);
        listaestudiantes.put("4",est4);
        listaestudiantes.put("5",est5);



        //Ordenarlo
        TreeMap<String, Estudiante> ordenado;
        ordenado=new TreeMap<>(new OrdenarAsc());
        ordenado.putAll(listaestudiantes);

        for (String  e:ordenado.keySet()
             ) {
            System.out.println("Clave:"+e+"Valor"+ordenado.get(e));

        }
//No me fuuincionna si le implemento el comparador en Estudiantes porque no estaria recibiendo estudiantes en
        //el for



    }


}
