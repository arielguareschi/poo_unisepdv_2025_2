import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String email;
    private Endereco endereco;
    private List<Matricula> matriculas;
    private List<PagamentoMensalidade> pagamentos;

    public Aluno(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        matriculas = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }


    public void addMatricula(Matricula matricula){
        matriculas.add(matricula);
    }

    public void addPagamento(PagamentoMensalidade pagamento){
        pagamentos.add(pagamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<PagamentoMensalidade> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PagamentoMensalidade> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
