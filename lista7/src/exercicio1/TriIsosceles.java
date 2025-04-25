package exercicio1;

public class TriIsosceles extends FiguraGeometrica {

    public TriIsosceles(double base, double altura) {
        super.setLado(base);
        super.setAltura(altura);
    }

    public double calcularArea(){
        return (super.getLado()*super.getAltura())/2;
    }

    public double calcularPerimetro(){
        return super.getLado() + (2*(Math.pow(((super.getAltura()*super.getAltura())+(Math.pow(super.getLado()/2,2))),0.5)));
    }
}
