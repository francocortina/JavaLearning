package EJ37ClasesGenericas1;


public class MetodosGenericos {
    //Metodo Genérico, puede estar en una clase ordinaria tmb
    //no es necesario que este en una clase generica <T>





    public static void main(String[] args) {
      String arraycomun []= new String [4];
      arraycomun[0]="Jose";
      arraycomun[1]="Fran";
      arraycomun[2]="Vicky";
      arraycomun[3]="Caroo";

        System.out.println(MisMatrices.Devolver(arraycomun));

      Empleado arrayEmpleado[]= new Empleado[10];
      arrayEmpleado[0]= new Empleado("Franco",24,230000);
      arrayEmpleado[1]= new Empleado("Vicky", 23,60000);
      arrayEmpleado[2]= new Empleado("Eze", 24,15000);
        System.out.println(MisMatrices.ImprimirCantidad(arrayEmpleado));
        System.out.println(MisMatrices.getMenor(arraycomun));



    }
class MisMatrices{


        /*Numero de elementos en el array*/
    //METODO
/*public para que sea publico para todas las clases
y static para que no tengo que instanciar la clase
Es generico para lo que entra pero no para lo que sale.*/
    public static <T> String Devolver(T array[]){
        for (int i = 0; i < array.length ; i++) {
            String elementos= (String)array[i];
            return "Elemento posicion "+i+" es "+ elementos;
        }
        //al parecer hay algun problema porque no lo recorre
            return "";
                }


    public static <T> String ImprimirCantidad(T array[]){

        return "Tamaño del array "+array.length;
    }
    //Tengo que ponerle extend porque en metodos genericos no tengo el metodo compare llamado
    public static <T extends Comparable> T getMenor(T array[]){
        if(array.length==0||array==null){
            return null;
        }

        //METODO COMPARE
        else{
            T elementomenor=array[0];
            for (int i = 1; i < array.length ; i++) {
                /*Sirve para ordenar alfabeticamente o por numero compareTo
                  Si da positivo es menor por eso se pone asic aulquier cosa ver
                   en libreria*/
                    if(elementomenor.compareTo(array[i])>0){
                        elementomenor=array[i];

                    }
            }
            return elementomenor;
        }

    }



}



}
