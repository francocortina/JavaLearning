package EJ22SobrecargadeMetodos;

public class Main {
    public static void main(String[] args) {
    CuentaBancaria cuentaFranco = new CuentaBancaria("Franco",223500);
    CuentaBancaria cuentaVicky= new CuentaBancaria("Franco", TipodeCuenta.AHORRO,3500);
    Informador Prueba1Franco= new Informador();

    //Cuando cambio el color queda cambiado a no se que pases el color por defecto
    Prueba1Franco.mostrarporPantalla("Soy Crack", Informador.COLOR_ROJO);
    Prueba1Franco.mostrarporPantalla(23);
    Prueba1Franco.mostrarporPantalla(22.54);
    }
}
