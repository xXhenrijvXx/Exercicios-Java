package exercicio1;

public class Ingresso {
    private double valor;

    public double getValor() {
        return valor;
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Ingresso(){

    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){

        return String.format("Valor do Ingresso: %.2f", getValor());
    }
}
