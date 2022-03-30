package Repaso2;

public class CuentaBanco {

   private String nombre;
    private String apellido;
   private int edad;
    private String mail;
    private double saldo;
    private TipoDeCuenTa tipo;

    //Constructor
    CuentaBanco(String nombre, String apellido, int edad, String mail, double saldo,TipoDeCuenTa tipo ){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.mail=mail;
    this.saldo=saldo;
    this.tipo=tipo;
    }

    public CuentaBanco(String nombre, int edad, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }


//metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Ingresarsaldo(double monto){
        if(monto<0){
            System.out.println("Monto no permitido");
        }else{
            saldo +=monto;
        }
    }

    public  void SacarDinero(double monto){
        if(saldo<monto){
            System.out.println("No dispone de suficiente saldo");
        }else{
            saldo-=monto;

        }

    }


    public  void sumar(int num1, int num2){
        int suma=num1+num2;
        System.out.println("La suma es: "+ suma);

    }
}
