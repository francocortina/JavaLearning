package EJ26Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        //declarar la longitud del array de multiples dimensiones

        int miArrayDeUnaDimensione[] = new int[20];
        int miArrayDeDosDimensiones [][] = new int [10][20];
        int miArrayDeTresDimensiones [][][] = new int [5][15][8];

      //Tabla de multiplicacion
        int TablaDeMultiplicacion [][]= new int [10][10];

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                TablaDeMultiplicacion[i][j]= i*j;
                //Estoy haciendo una tabla de multiplicacion con las posiciones.
            }

        }

        System.out.println("La multiplicacion [4][5]"+TablaDeMultiplicacion[4][5]);

        //Otra forma de declarar el array
        int miArray [][]= {{2,5,-9},{-7,25,0},{85,2,365}};

    }
}
