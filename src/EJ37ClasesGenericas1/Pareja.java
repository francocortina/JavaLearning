package EJ37ClasesGenericas1;

public class Pareja <T>{

    private T elemento;
//Coontructor
   public Pareja(T elemento){
    this.elemento=elemento;

    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(T elemento){
        this.elemento=elemento;

    }









}
