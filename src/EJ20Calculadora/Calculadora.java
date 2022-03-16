package EJ20Calculadora;

public class Calculadora {


    //Método
    double calcularAreaCirculo(double radio){
        return Math.PI*radio*radio;

    }

    double calcularVolumenPrismaRectangular(double altura, double ancho, double profundidad){
        return altura*ancho*profundidad;
    }

    //tamaño de pparametros indefinidos se escpecifican con 3 puntoss,
    //osea no sabes la cantidad de argumentos
    double calcularMedia(double ... numeros){
        if (numeros.length== 0 ){
            return 0.0;
        }
        double suma= 0.0;
        for (int i = 0; i < numeros.length ; i++) {
            suma += numeros[i];
        }
        return suma/numeros.length;
    }

}
