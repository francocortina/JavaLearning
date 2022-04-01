package EJ36ArraylistGenerico1;

public class ArrrayGenerico {
    //Inicializo el array de Objetos
    private Object datosElemento[];
    private int i=0;

    public ArrrayGenerico(int z){
        //ACA asigno la cantidad de elementos que tendra mi array de objetos
        /*new Object, inicializo un objeto de tipo array[con tantos espacios en memoria]*/
        this.datosElemento= new Object[z];

    }

    public Object getElemento(int i){

        return datosElemento[i];

    }

    public void add(Object o){
        datosElemento[i]=o;
            i++;
    }


}
