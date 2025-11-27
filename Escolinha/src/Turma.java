import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Curso curso;
    private Professor professor;
    private List<Matricula> matriculas;
    private List<Avaliacao> avaliacoes;

    public Turma(String codigo, Curso curso, Professor professor) {
        this.codigo = codigo;
        this.curso = curso;
        this.professor = professor;
        matriculas = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public void addMatricula(Matricula matricula){
        matriculas.add(matricula);
    }

    public void addAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
