package EJ21Constructor;

public class CuentaBancaria {

    //Atributos
    String titular;
    //asi se declara el enumerado
    TipodeCuenta tipoCuenta;
    double saldo;

    //las constantes se declaran con final al principio y en mayuscula
    //public static final String TIPO_AHORRO="ahorro";
    //public static final String TIPO_NOMINA="nomina";



    //Constructor
    /*Podes crear cuantos constructuores quieras para asegurarte que los objetos de las clasees
    * se creen como vos quieras */
 CuentaBancaria(String t, TipodeCuenta tipo, double s){

titular =t;
tipoCuenta=tipo;
saldo=s;


}

    CuentaBancaria(String t, double s){

        titular =t;
        tipoCuenta= TipodeCuenta.INFANTIL;
        saldo=s;


    }


   CuentaBancaria(){
        tipoCuenta=TipodeCuenta.AHORRO;
    }

    //Métodos

void sacarDinero(double monto){
    if(monto>0 & monto<saldo){
        saldo -=monto;
    }
return;
}

void ingresarDinero(double monto){

    if (monto>0){
        saldo +=monto;
    }
}

void cambiarTipo(TipodeCuenta nuevoTipo){

     tipoCuenta=nuevoTipo;
}

double obtenerSaldo(){
    return saldo;

}




}
