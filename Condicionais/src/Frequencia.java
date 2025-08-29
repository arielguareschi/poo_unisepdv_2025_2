import javax.swing.*;

public class Frequencia {
    public static void main(String[] args) {
        String opt = JOptionPane.
                showInputDialog("Digite a opção " +
                        "relativa a carga horária\n" +
                        "1 - 40 horas\n" +
                        "2 - 80 horas\n" +
                        "3 - 100 horas");
        int escolha = Integer.parseInt(opt);
        int faltas = Integer.parseInt(JOptionPane.
                showInputDialog("Digite a quantidade de faltas"));
        int corte = 0;
        switch (escolha){
            case 1:
                corte = (40 * 25) / 100;
                break;
            case 2:
                corte = (80 * 25) / 100;
                break;
            case 3:
                corte = (100 * 25) / 100;
                break;
        }
        String situacao = "";
        if (faltas >= corte){
            situacao = "Reprovado";
        } else {
            situacao = "Aprovado";
        }
        Double dias = (double) (corte / 4);
        System.out.println("Pode faltar " + corte +
                " - tem " + faltas +
                " e a situação é: " + situacao +
                " - Pode faltar: " + dias + " dias");
    }
}
