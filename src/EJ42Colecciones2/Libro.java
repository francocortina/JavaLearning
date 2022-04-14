package EJ42Colecciones2;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;



    //Constructor
    Libro(String titulo, String autor, int ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    }
//Metodo getTodo

    public String getTodo(){

        return "Titulo: "+ titulo+ " autor: "+autor+ " ISBN: "+ ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

//compara el objeto donde nos encontramos con otro
  /*  public boolean equals(Object obj){

       if (obj instanceof Libro){
           //Si es de la instancia libro entro
           //Luego tengo que castear ese objeto en tipo Libro no se entiende por que si ya era de instancia libro
           Libro otro= (Libro)obj;
           if (this.ISBN==otro.ISBN){
               return true;

           }else
           {return false;}

       }else {return false;}

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return getISBN() == libro.getISBN();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getISBN());
    }
}
