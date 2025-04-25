package exercicio2;

public class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super.setNome(nome);
        super.setSalario(salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario(){
        return super.getSalario() + percentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome='" + super.getNome() + '\'' +
                ", salario sem comissão=" + super.getSalario() + '\'' +
                ", salario com comissão=" + calcularSalario() + '\'' +
                ", percentualComissao=" + percentualComissao +
                '}';
    }
}
