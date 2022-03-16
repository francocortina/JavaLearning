package EJ19Clasemetodo;

public class Main {
    public static void main(String[] args) {

     CuentaBancaria cuentaFranco= new CuentaBancaria();
//Instanciando atributos
    cuentaFranco.titular="Franco";
    cuentaFranco.Tipocuenta="Corriente";
    cuentaFranco.saldo=350000;
//LLamando a los métodos
cuentaFranco.ingresarDinero(30000);
cuentaFranco.sacarDinero(39000);
cuentaFranco.cambiarTipodeCuenta("ahorro");

    }
}
