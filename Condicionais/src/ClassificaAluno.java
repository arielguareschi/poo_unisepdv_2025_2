import java.util.Scanner;

public class ClassificaAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = s.nextLine();

        System.out.println("Digite a nota do aluno: ");
        Double nota = s.nextDouble();
        String desc = "";

        if (nota >= 0.0 && nota <= 2.0){
            desc = "ATENÇÃO MÁXIMA";
        } else if (nota > 2.0 && nota <= 5.0){
            desc = "ATENÇÃO";
        } else if (nota > 5.0 && nota <= 7.0){
            desc = "FICAR DE OLHO";
        } else if (nota > 7.0 && nota <= 8.0){
            desc = "TA BOM";
        } else if (nota > 8.0 && nota <= 9.0){
            desc = "PODE MELHORAR";
        } else if (nota > 9.0 && nota <= 10.0){
            desc = "NÃO FEZ MAIS QUE OBRIGAÇÃO";
        } else {
            desc = "NOTA INVALIDA";
        }
        System.out.println("Aluno: " + aluno +
                " - Nota: " + nota +
                " (" +desc +")");
    }
}
