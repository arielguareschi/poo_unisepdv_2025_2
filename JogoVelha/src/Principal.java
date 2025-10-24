import javax.swing.*;

public class Principal {

    public static String mostrarTabuleiro(String[][] t){
        String retorno = "  1   2   3\n";
        for (int i = 0; i< 3; i++){
            retorno += (i + 1) + " ";
            for (int j = 0; j < 3; j++){
                retorno += t[i][j];
                if (j < 2){
                    retorno += " | ";
                }
            }
            retorno += "\n";
            if (i < 2){
                retorno += " ---+---+---\n";
            }
        }
        return retorno;
    }

    public static boolean tabuleiroCheio(String[][] t){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (t[i][j].equals(" ")){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] opts = {"X", "O"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Jogador 1, escolha seu time:",
                "Que time é teu?",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opts,
                opts[0]);
        String jogador1;
        String jogador2;
        if (escolha == 0) {
            jogador1 = "X";
            jogador2 = "O";
        } else {
            jogador1 = "O";
            jogador2 = "X";
        }
        String[][] tabuleiro = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
        };
        String jogadorAtual = jogador1;
        boolean jogoAtivo = true;

        System.out.println(mostrarTabuleiro(tabuleiro));
//        while (jogoAtivo){
//
//        }
    }

}
