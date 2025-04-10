public class Vendedor_Exe03 {
    private String nome;
    private double salario;

    public Vendedor_Exe03(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calculaSalario(int vendas){
        return salario + (vendas * 0.15);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
