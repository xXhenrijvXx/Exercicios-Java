package exercicio2;

public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nome, float salario, String departamento) {
        super.setNome(nome);
        super.setSalario(salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                '}';
    }
}
