import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

    private String descricao;
    private Double peso;
    private LocalDate data;
    private Turma turma;
    private List<Nota> notas;
    public Avaliacao(String descricao, Double peso, LocalDate data, Turma turma) {
        this.descricao = descricao;
        this.peso = peso;
        this.data = data;
        this.turma = turma;
        notas = new ArrayList<>();
    }
    public void addNota(Nota nota){
        notas.add(nota);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
