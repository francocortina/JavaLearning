package EJ27ForEach;

public class ForEach {
    public static void main(String[] args) {
        int miArray [] = {1,2,3,125,120,356,80};
        //Bucle for comun
        int maximo;
        int minimo;
        maximo=minimo=miArray[0];
        for (int i = 0; i < miArray.length; i++) {
            if(miArray[i]>maximo) maximo= miArray[i];
            if(miArray[i]<minimo) minimo = miArray[i];
        }
        System.out.println("El  numero maximo es : " + maximo);
        System.out.println("El numero minimo es :" + minimo);
    
    //ForEach
        for (int entero:miArray) {
            System.out.println("el numero de recorrido es "+ entero);
            if(entero>maximo) maximo =entero;
            if(entero<minimo) minimo = entero;
            
        }

        System.out.println("El  numero maximo es : " + maximo);
        System.out.println("El numero minimo es :" + minimo);
    }
}
