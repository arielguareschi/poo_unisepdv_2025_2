import java.time.LocalDate;

public class PagamentoMensalidade {

    private Aluno aluno;
    private Double valor;
    private LocalDate dataPgto;
    private boolean pago;

    public PagamentoMensalidade(Aluno aluno, Double valor, LocalDate dataPgto) {
        this.aluno = aluno;
        this.valor = valor;
        this.dataPgto = dataPgto;
        this.pago = true;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(LocalDate dataPgto) {
        this.dataPgto = dataPgto;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
