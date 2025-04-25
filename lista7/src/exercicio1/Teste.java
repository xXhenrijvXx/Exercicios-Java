package exercicio1;

public class Teste {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo(3);
        FiguraGeometrica f2 = new Quadrado(3);
        FiguraGeometrica f3 = new Retangulo(3, 4);
        FiguraGeometrica f4 = new TriEquilatero(3);
        FiguraGeometrica f5 = new TriEscaleno(3, 4, 5);
        FiguraGeometrica f6 = new TriIsosceles(3, 4);

        System.out.println("Perimetro: " + f1.calcularPerimetro() + " | Área: " + f1.calcularArea());
        System.out.println("Perimetro: " + f2.calcularPerimetro() + " | Área: " + f2.calcularArea());
        System.out.println("Perimetro: " + f3.calcularPerimetro() + " | Área: " + f3.calcularArea());
        System.out.println("Perimetro: " + f4.calcularPerimetro() + " | Área: " + f4.calcularArea());
        System.out.println("Perimetro: " + f5.calcularPerimetro() + " | Área: " + f5.calcularArea());
        System.out.println("Perimetro: " + f6.calcularPerimetro() + " | Área: " + f6.calcularArea());
    }
}
