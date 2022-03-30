package EJ32Genéricos;
// Para  declarar el tipo generico se suele usar <T> aunque a veces por otra
//Es un Elemento indefinido.
public class Caja <T>{
    T elemento;

    //Contructor
    Caja(T elemento){
        this.elemento=elemento;
    }

//Devuelve el elemento en nuesttra caja
    public T getElemento() {
        return elemento;
    }

/*
    Metodo para comprobar si el elemento que esta en nuestra caja pertenece
    al mismo que nos pasen*/

//Puede ser de otro tipo generico
    <V> boolean perteneceElContenidoALaMismaClase(V contenido){
        return elemento.getClass() == contenido.getClass();
        //getClass te devuelve el tipo de elemento
    }


}
