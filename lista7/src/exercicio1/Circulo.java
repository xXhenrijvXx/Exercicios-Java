package exercicio1;

public class Circulo extends FiguraGeometrica {
    public Circulo(double raio) {
        super.setRaio(raio);
    }

    public double calcularArea(){
        return 2*3.1415*Math.pow(super.getRaio(), 2);
    }

    public double calcularPerimetro(){
        return 2*3.1415*getRaio();
    }
}
