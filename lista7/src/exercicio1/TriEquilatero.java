package exercicio1;

public class TriEquilatero extends FiguraGeometrica {
    public TriEquilatero(double lado) {
        super.setLado(lado);
    }

    public double calcularArea(){
        return ((super.getLado() * super.getLado()) * Math.pow(3, 0.5)) / 4;
    }

    public double calcularPerimetro(){
        return 3 * super.getLado();
    }

}
