package EJ19Clasemetodo;

public class CuentaBancaria {
    //Atributos
    String titular;
    String Tipocuenta;
    double saldo;

    //Métodos
    /*La palabra void significa que nuestro método no devuelve nningun valor*/

    void sacarDinero(double monto){
        if (monto<=saldo){
            saldo=saldo-monto;
            System.out.println("Su salldo actual es:"+saldo+ "El monto retirado son: "+monto);
        }else{

            System.out.println("Saldo insuficiente");
        }

    }

    void ingresarDinero(double monto){
        if(monto>0){
            saldo +=monto;
            System.out.println("Saldo actual: "+saldo+ "Monto ingresado:"+monto );
        }

    }


    void cambiarTipodeCuenta(String nuevoTipo){
        Tipocuenta=nuevoTipo;
        System.out.println("tipo de cuenta: "+Tipocuenta );

    }


}
