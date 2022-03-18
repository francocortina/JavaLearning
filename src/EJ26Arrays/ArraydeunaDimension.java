package EJ26Arrays;

public class ArraydeunaDimension {
    public static void main(String[] args) {
        //Declaracion de array
        String diasDeLaSemana [] = new String [7];//Array de 7 elementos

        //Ejemplo manual por posicion
        diasDeLaSemana[0]="lunes";
        diasDeLaSemana[1]="martes";
        diasDeLaSemana[2]= "miercoles";
        diasDeLaSemana[3]="jueves";
        diasDeLaSemana[4]= "viernes";
        diasDeLaSemana[5]="sabado";
        diasDeLaSemana[6]="domingo";

        System.out.println("El segundo dia del array es "+ diasDeLaSemana[1]);
        for (int i = 0; i < diasDeLaSemana.length ; i++) {
            System.out.println("Hoy es :"+ diasDeLaSemana[i]);
        }

//Por lo visto no es necesario declararlo como hizo arriba
        int numeros []={8,9,10,11,12,7,1};

        int minimo;
        int maximo;
        maximo= minimo =numeros[0];

        //Para encontrar el valor minimo y maximo
        for (int i = 0; i < numeros.length  ; i++) {

            if(numeros[i]>maximo) maximo= numeros[i];
            if (numeros[i]<minimo) minimo = numeros[i];

        }

        System.out.println("El valor minimo del Array es : "+ minimo);
        System.out.println("El valor maximo del Array es:"+ maximo);

    }

}

