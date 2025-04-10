public class Aluno_Exe01 {
    private String aluno;
    private int n1, n2, n3;

    public Aluno_Exe01(String aluno) {
        this.aluno = aluno;
        n1 = n2 = n3 = 0;
    }

    public Aluno_Exe01(String aluno, int n1, int n2, int n3) {
        this.aluno = aluno;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calculaMedia(){
        return ((double) n1 + n2 + n3) / 3;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public String getAluno() {
        return aluno;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }
}
