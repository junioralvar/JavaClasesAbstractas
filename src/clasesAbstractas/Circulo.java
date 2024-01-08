package clasesAbstractas;

public class Circulo extends Figura {
    private final float PI = 3.14f;
    private float radio;

    public Circulo(String color,float radio) {
        super(color);
        this.radio = radio;

    }
    @Override
    public float area(){
        return PI*(radio*radio);
    }

    @Override
    public float perimetro(){
        return 2*PI*radio;
    }

    @Override
    public void printColor(){
        System.out.println("El color del circulo es : " + color);
    }
}
