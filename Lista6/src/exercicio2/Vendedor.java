package exercicio2;

public class Vendedor {
    private float percentualComissao;

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "percentualComissao=" + percentualComissao +
                '}';
    }
}
