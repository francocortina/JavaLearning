package EJ18Clases;

public class Main {
    /*Esta es la clase de inicio al programa*/
    public static void main(String[] args) {
        //Creo un objeto de la CuentaBancaria

        CuentaBancaria cuentadeFran = new CuentaBancaria();

        //Ingreso los atributos
        cuentadeFran.titular="Franco";
        cuentadeFran.tipodeCuenta="nómina";
        cuentadeFran.Saldo=350000;

        System.out.println("¿Que saldo tiene la cuenta de Fran?"+ cuentadeFran.Saldo);


    }

}
