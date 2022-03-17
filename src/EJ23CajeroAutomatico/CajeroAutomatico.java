package EJ23CajeroAutomatico;



public class CajeroAutomatico {
TipoCuentaBancaria cuentaBancariaActual;
String usuario;
String contraseña;
double saldo;

//Constructor
    CajeroAutomatico(String usuario, String contraseña,TipoCuentaBancaria tipo,double saldo){
    this.usuario= usuario;
    this.contraseña=contraseña;
    this.cuentaBancariaActual=tipo;
    this.saldo=saldo;
    }

  //Metodos
  void sacarDinero(double monto){
      if(monto>0 & monto<saldo){
          saldo -=monto;
          System.out.println("Su saldo actual es : "+saldo + "  Monto retirado: "+ monto);
      }else{
          System.out.println("Saldo insuficiente");
      }
  }
    void ingresarSaldo(double monto){
        if(monto<0){return;}
        else{
            saldo +=monto;
            System.out.println("Su saldo actual es: "+saldo + " Monto ingresado: "+monto);

        }


    }
    void mostrarSaldo(){
        System.out.println("Saldo actual: "+saldo);
    }




}
