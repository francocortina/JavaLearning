package EJ52RepasoRecorridos;

import EJ27ForEach.ForEach;
import EJ48Mapas2.Estudiante;
import EJ48Mapas2.OrdenarAsc;

import java.math.BigInteger;
import java.util.*;

public class Recorridos {

    public static void main(String[] args) {
        Alumno alu1= new Alumno("Franco","Cortina",40895483 );
        Alumno alu2= new Alumno("Manu","Cortina",44545455 );
        Alumno alu3= new Alumno("Nico","Cortina",40556566 );
        Alumno alu4= new Alumno("Sebas","Cortina",4721212 );
        //ARRAYLIST

        ArrayList<Alumno> Escuela= new ArrayList<Alumno>();
        Escuela.add(alu1);
        Escuela.add(alu2);
        Escuela.add(alu3);
        Escuela.add(alu4);
        Collections.sort(Escuela,new Comparador());

        for (Alumno a:
             Escuela) {
            System.out.println("El nombre del alumno es: "+a.getNombre()+" Su DNI ES: "+ a.getDni());

        }

        HashMap<Integer,Alumno> Escuela2= new HashMap<Integer,Alumno>();
        Escuela2.put(0,alu1);
        Escuela2.put(1,alu2);
        Escuela2.put(2,alu3);
        Escuela2.put(3,alu4);

        for (Map.Entry<Integer,Alumno> a: Escuela2.entrySet()
             ) {

            System.out.println("clave: "+a.getKey()+" Nombre: "+ a.getValue().getNombre());

        }
















    }




}
