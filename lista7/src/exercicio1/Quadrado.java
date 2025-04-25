package exercicio1;

public class Quadrado extends FiguraGeometrica{

    public Quadrado(double lado) {
        super.setLado(lado);
    }

    public double calcularArea(){
        return super.getLado() * super.getLado();
    }

    public double calcularPerimetro(){
        return 4*super.getLado();
    }
}
