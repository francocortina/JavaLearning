package EJ31ArrayListObjetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos= new ArrayList<Alumno>();
        Alumno alu1= new Alumno("Franco",24);
        Alumno alu2= new Alumno("Vicky", 23);
        Alumno alu3= new Alumno("Manuel", 27);
        Alumno alu4= new Alumno("Menem", 22);
        Alumno alu5= new Alumno("Mica", 21);
        Alumno alu6= new Alumno("Mauro", 32);

        listaAlumnos.add(alu1);
        listaAlumnos.add(alu2);
        listaAlumnos.add(alu3);
        listaAlumnos.add(alu4);
        listaAlumnos.add(alu5);
        listaAlumnos.add(alu6);


        System.out.println("Lista de alumnos"+ listaAlumnos);

        for (Alumno entero:listaAlumnos) {
            System.out.println("Objeto: "+ entero.nombre);
        }

        listaAlumnos.remove(alu1);
        System.out.println("Lista actual"+ listaAlumnos);

        for (int  i = 0;  i < listaAlumnos.size(); i++) {
            System.out.println("Alumno numero: "+i+"  "+listaAlumnos.get(i).getNombre());

        }

        for (Alumno alumno:listaAlumnos) {
            System.out.println("Alumno: "+ alumno.getNombre()+" "+ alumno.getEdad());

        }

        listaAlumnos.remove(1);
        System.out.println(listaAlumnos);
        System.out.println("Cantidad de Alumnos: "+listaAlumnos.size());

      listaAlumnos.get(2).setNombre("Franco");
        System.out.println("Nombre de la posicion 3 cambiada a "+ listaAlumnos.get(2).nombre );
        System.out.println("Nombre posicion 0="+ listaAlumnos.get(0).nombre );
    }
}
