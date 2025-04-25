package exercicio1;

public class TriEscaleno extends FiguraGeometrica{
    public TriEscaleno(double a, double b, double c) {
        super.setLado(a);
        super.setAltura(b);
        super.setRaio(c);
    }

    public double calcularPerimetro(){
        return getLado() + getAltura() + getRaio();
    }

    public double calcularArea(){
        double s = (calcularPerimetro())/2;
        return Math.pow(s*(s-getLado())*(s-getAltura())*(s-getRaio()),0.5);
    }
}
