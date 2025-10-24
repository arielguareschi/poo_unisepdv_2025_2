import javax.swing.*;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        String[] opts = {"Pedra", "Papel", "Tesoura", "Sair"};
        Random r = new Random();
        int pontosUsuario = 0;
        int pontosComputador = 0;

        while (true) {
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção",
                    "Jokenpo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opts,
                    opts[3]);

            if (escolha == 3 || escolha == JOptionPane.CLOSED_OPTION) {
                break;
            }

            int pc = r.nextInt(3);
            String jogadaUsuario = opts[escolha];
            String jogadoComputador = opts[pc];
            String resultado = "";
            if (jogadaUsuario.equals(jogadoComputador)) {
                resultado = "Empate";
            } else if (jogadaUsuario.equals("Pedra")) {
                if (jogadoComputador.equals("Tesoura")) {
                    resultado = "Voce venceu! Pedra quebra a tesoura!";
                    pontosUsuario++;
                } else {
                    resultado = "Voce Perdeu! Papel embrulha a pedra!";
                    pontosComputador++;
                }
            } else if (jogadaUsuario.equals("Papel")) {
                if (jogadoComputador.equals("Pedra")) {
                    resultado = "Voce venceu! Papel embrulha a pedra!";
                    pontosUsuario++;
                } else {
                    resultado = "Voce perdeu! Tesoura corta o papel!";
                    pontosComputador++;
                }
            } else if (jogadaUsuario.equals("Tesoura")) {
                if (jogadoComputador.equals("Papel")) {
                    resultado = "Voce venceu! Tesoura corta o papel!";
                    pontosUsuario++;
                } else {
                    resultado = "Voce perdeu! Pedra quebra a tesoura!";
                    pontosComputador++;
                }
            }
            JOptionPane.showMessageDialog(null,
                    "Voce jogou: " + jogadaUsuario + "\n" +
                            "Computador jogou: " + jogadoComputador + "\n" +
                            "Resultado: " + resultado + "\n" +
                            "Placar parcial:" +
                            "\n Você: " + pontosUsuario +
                            "\nComputador: " + pontosComputador);

        }
        String msgFinal = "Placar Final:" +
                "\n Você: " + pontosUsuario +
                "\nComputador: " + pontosComputador + "\n\n";
        if (pontosUsuario > pontosComputador){
            msgFinal += "Você Venceu!";
        } else if (pontosUsuario < pontosComputador){
            msgFinal += "Voce Perdeu!";
        } else {
            msgFinal += "Empate!";
        }
        JOptionPane.showMessageDialog(null, msgFinal);
    }
}
