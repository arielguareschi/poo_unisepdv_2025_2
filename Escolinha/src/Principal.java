import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Escola grifinoia = new Escola("Grifinóia");
        Professor girafales = new Professor("Girafales",
                "Café");
        grifinoia.addProfessor(girafales);
        Aluno ariPoter = new Aluno("Ari Pote",
                "bruxinhomalvadao1124@gmail.com",
                new Endereco("Beco do Robin",
                        "69",
                        "Gothan City",
                        "Deploravel"));
        grifinoia.addAluno(ariPoter);

        Curso manipulacaoDeVara = new Curso(
                "Manipulação de Varinha - The Elder Wand",
                24,
                grifinoia);
        grifinoia.addCurso(manipulacaoDeVara);

        Turma magia = new Turma("11", manipulacaoDeVara,
                girafales);
        Matricula matAri = new Matricula(ariPoter, magia,
                LocalDate.now());
        magia.addMatricula(matAri);
        Avaliacao b1 = new Avaliacao("B1", 10.0,
                LocalDate.now(), magia);
        Avaliacao b2 = new Avaliacao("B2", 10.0,
                LocalDate.now(), magia);
        magia.addAvaliacao(b1);
        magia.addAvaliacao(b2);
        manipulacaoDeVara.addTurma(magia);

        Nota notab1 = new Nota(b1, ariPoter, 6.8);
        matAri.addNota(notab1);

        PagamentoMensalidade pagAri = new PagamentoMensalidade(ariPoter,
                5000.0, LocalDate.now());
        ariPoter.addPagamento(pagAri);

        System.out.println(grifinoia);
    }
}
