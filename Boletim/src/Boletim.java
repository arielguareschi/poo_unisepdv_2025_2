import javax.swing.*;

public class Boletim {

    public static void main(String[] args) {
        String alunos[] = new String[10];
        Double b1[] = new Double[10];
        Double b2[] = new Double[10];

        for(int i = 0; i< 10; i++){
            String nome = JOptionPane
        .showInputDialog("Digite o nome do aluno:");
            Double nota1 = Double
            .parseDouble(JOptionPane
            .showInputDialog("Digite a nota B1 do aluno:"));
            Double nota2 = Double
            .parseDouble(JOptionPane
            .showInputDialog("Digite a nota B2 do aluno:"));

            alunos[i] = nome;
            b1[i] = nota1;
            b2[i] = nota2;
        }

        String nomes = "";
        Double mediaTurma = 0.0;
        for (int i = 0; i < 10; i++) {
            Double media = (b1[i] + b2[i]) / 2;
            mediaTurma += media;

            nomes = nomes +
                    "Aluno: " + alunos[i] +
                    " - B1: " + b1[i] +
                    " - B2: " + b2[i] +
                    " - Média: " + media + "\n";
        }
//        mediaTurma = mediaTurma / 10;
        mediaTurma /= 10;
        nomes = nomes + "Média da Turma: " +
                mediaTurma;
        JOptionPane.showMessageDialog(
                null,
                nomes);

    }
}
