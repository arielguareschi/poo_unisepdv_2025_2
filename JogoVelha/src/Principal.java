import javax.swing.*;

public class Principal {

    public static String mostrarTabuleiro(String[][] t){
        StringBuilder retorno = new StringBuilder("  1   2   3\n");
        for (int i = 0; i< 3; i++){
            retorno.append((i + 1)).append(" ");
            for (int j = 0; j < 3; j++){
                retorno.append(t[i][j]);
                if (j < 2){
                    retorno.append(" | ");
                }
            }
            retorno.append("\n");
            if (i < 2){
                retorno.append(" ---+---+---\n");
            }
        }
        return retorno.toString();
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

    public static boolean verificarVitoria(String[][] t, String j){
        // verifica em h linha
        for (int h = 0; h < 3; h++){
            if (t[h][0].equals(j) && t[h][1].equals(j) && t[h][2].equals(j)){
                return true;
            }
        }
        // valida em k coluna
        for (int k = 0; k <3; k++){
            if (t[0][k].equals(j) && t[1][k].equals(j) && t[2][k].equals(j)) {
                return true;
            }
        }
        // valida na diagonal i
        if (t[0][0].equals(j) && t[1][1].equals(j) && t[2][2].equals(j)){
            return true;
        }
        // valida na diagonal alema
        return t[0][2].equals(j) && t[1][1].equals(j) && t[2][0].equals(j);
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

        while (jogoAtivo){
            JOptionPane.showMessageDialog(
                    null,
                    mostrarTabuleiro(tabuleiro),
                    "Vez do jogador " + jogadorAtual,
                    JOptionPane.INFORMATION_MESSAGE
            );

            int linha, coluna;
            boolean jogadaValida = false;
            while (!jogadaValida){
                try{
                    String lStr = JOptionPane.showInputDialog(
                            null,
                            "Jogador " + jogadorAtual +
                                    ", informe a linha (1-3)");
                    if (lStr == null){
                        return;
                    }
                    linha = Integer.parseInt(lStr) -1;

                    String cStr = JOptionPane.showInputDialog(
                            null,
                            "Jogador " + jogadorAtual +
                                    ", informe a coluna (1-3)");
                    if (cStr == null){
                        return;
                    }
                    coluna = Integer.parseInt(cStr) -1;

                    if (linha >= 0 && linha < 3  &&
                        coluna >=0 && coluna < 3 &&
                        tabuleiro[linha][coluna].equals(" ")){
                        tabuleiro[linha][coluna] = jogadorAtual;
                        jogadaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Posição errada, " +
                                        "ou já tem algo nela!" +
                                        "Tente de novo");
                    }
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(
                            null,
                "Digita certo seu burro! Numeros de 1 a 3");
                }
            }

            if (verificarVitoria(tabuleiro, jogadorAtual)){
                JOptionPane.showMessageDialog(
                        null,
                        mostrarTabuleiro(tabuleiro) +
                                "\n\nJogador " + jogadorAtual + " venceu!"
                        );
                jogoAtivo = false;
            } else if (tabuleiroCheio(tabuleiro)){
                JOptionPane.showMessageDialog(
                        null,
            mostrarTabuleiro(tabuleiro) + "\n\nEmpate!");
                jogoAtivo = false;
            }else {
                if (jogadorAtual.equals(jogador1)){
                    jogadorAtual = jogador2;
                } else {
                    jogadorAtual = jogador1;
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "Vão em paz e que Deus vos acompanhe!");
    }

}
