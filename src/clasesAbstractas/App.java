package clasesAbstractas;

public class App {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Azul",4.2f);
        Circulo circulo = new Circulo("Rojo",2.5f);
        float areaCuadrado = cuadrado.area();
        float perimetroCuadrado = cuadrado.perimetro();
        float areaCirculo = circulo.area();
        float perimetroCirculo = circulo.perimetro();

        System.out.println("El area del cuadrado es : " + areaCuadrado);
        System.out.println("El perimetro del cuadrado es : " + perimetroCuadrado);
        cuadrado.printColor();

        System.out.println("El area del circulo es : " + areaCirculo);
        System.out.println("El perimetro del circulo es : " + perimetroCirculo);
        circulo.printColor();
    }
}
