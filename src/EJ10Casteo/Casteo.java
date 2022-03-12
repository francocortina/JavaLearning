package EJ10Casteo;

public class Casteo {
    public static void main(String[] args) {
        /*Conversion de int a flloar que es mas grande y no pierde info*/
        int variabledeTipoInt= 10;
       float variabledeTipoFloat= variabledeTipoInt;

/*      como estos son incompatiobles no se puede hacer porque perderias info
       short variabledeTipoShort= variabledeTipoInt;
       */

        /*Cuando la variable es mas grande te permite convertirlo*/
        double variabledeTipoDouble= variabledeTipoFloat;

        /*Como forzar la conversion?*/

        double otraVariableTipoDouble=2.76;
        int otraVariableDeTipoInt=(int)otraVariableTipoDouble;
        System.out.println("el resultado del casteo de double a int , pierde info de la parte decimal de 2.76 a : "+ otraVariableDeTipoInt);

        byte variable1 = 5;
        byte variable2 = 10;
        //esos datos son int por lo que hay que transformarlos
        byte suma = (byte)(variable1 + variable2);

        System.out.println("El resultado de la suma de byte es:  "+ suma);


    }
}
