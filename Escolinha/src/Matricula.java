import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Matricula {

    private Aluno aluno;
    private Turma turma;
    private LocalDate data;
    private List<Nota> notas;
    public Matricula(Aluno aluno, Turma turma, LocalDate data) {
        this.aluno = aluno;
        this.turma = turma;
        this.data = data;
        notas = new ArrayList<>();
    }
    public void addNota(Nota nota){
        notas.add(nota);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
