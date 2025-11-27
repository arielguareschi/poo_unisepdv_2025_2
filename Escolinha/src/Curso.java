import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Escola escola;
    private List<Turma> turmas;

    public Curso(String nome, int cargaHoraria, Escola escola) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.escola = escola;
        turmas = new ArrayList<>();
    }

    public void addTurma(Turma turma){
        turmas.add(turma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
