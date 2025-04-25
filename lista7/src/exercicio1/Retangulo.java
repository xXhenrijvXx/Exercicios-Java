package exercicio1;

public class Retangulo extends FiguraGeometrica {


    public Retangulo(double altura, double largura) {
        super.setAltura(altura);
        super.setLado(largura);
    }

    public double calcularArea(){
        return super.getAltura() * super.getLado();
    }

    public double calcularPerimetro(){
        return 2 * (super.getAltura() + super.getLado());
    }
}
