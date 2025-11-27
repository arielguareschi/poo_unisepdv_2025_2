public class Nota {
    private Avaliacao avaliacao;
    private Aluno aluno;
    private Double nota;

    public Nota(Avaliacao avaliacao, Aluno aluno, Double nota) {
        this.avaliacao = avaliacao;
        this.aluno = aluno;
        this.nota = nota;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
