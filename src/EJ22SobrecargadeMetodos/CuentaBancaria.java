package EJ22SobrecargadeMetodos;


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

    /*TAMBIÉN UTILIZAREMOS EL THIS, esto es para poder utilizar los parametros de entrara con el
    * mismo  nombre que las cariables de instancia asi no se hace tan engorroso,
    * el this apunta a esa variable de instancia y nos permite poner como parametro el mismo nombre*/
 CuentaBancaria(String titular, TipodeCuenta tipo, double saldo){

this.titular =titular;
this.tipoCuenta=tipo;
this.saldo=saldo;


}

    CuentaBancaria(String titular, double saldo){

        this.titular =titular;
        this.tipoCuenta= TipodeCuenta.INFANTIL;
        this.saldo=saldo;


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

     this.tipoCuenta=nuevoTipo;
}

double obtenerSaldo(){
    return saldo;

}




}
