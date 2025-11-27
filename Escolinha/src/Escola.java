import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Curso> cursos;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        cursos = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
    }

    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public void addProfessor(Professor professor){
        professores.add(professor);
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
