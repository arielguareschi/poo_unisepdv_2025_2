public class Notas {
    public static void main(String[] args) {
        // comentário de 1 linha
        /*
        comentário de muitas linhas
         */
        /*
        Crie as variaveis para armazenar
        o nome do aluno (String),
        a nota b1 e b2 (Double),
        e o periodo (int).
        após isso imprima os dados das variaveis
         */
        String nome = "Tiburso";
        Double b1 = 5.5;
        Double b2 = 7.5;
        int periodo = 2;
        System.out.println("Nome: " + nome);
        System.out.println(periodo + "º Período" );
        System.out.println("Nota B1: " + b1);
        System.out.println("Nota B2: " + b2);
        // agora eu quero a média do semestre
        Double media = (b1 + b2) / 2;
        System.out.println("Média: " + media);
        // com base na nota de B1 e sabendo que a
        // média é 7,0 informe qual a nota
        // necessária para que o aluno
        // seja aprovado

        System.out.println("Tem que tirar na B2:" + (14 - b1));

    }
}
