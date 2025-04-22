package exercicio1;

public class IngressoVIP extends Ingresso{
    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public IngressoVIP() {
    }

    public String toString(){
        return String.format("Valor do Ingresso VIP: %.2f", (super.getValor() + getValorAdicional()));
    }
}
