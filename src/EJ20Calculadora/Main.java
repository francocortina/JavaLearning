package EJ20Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        double area=calculadora1.calcularAreaCirculo(2.5);
        System.out.println("El area del círculo es: "+ area);

        double volumenprisma= calculadora1.calcularVolumenPrismaRectangular(24,30,25);
        System.out.println("El volumen del prisma es : " + volumenprisma);

        calculadora1.calcularMedia(2.5,2,5,6,8);
    }

}
