import javax.swing.*;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        String[] opts = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Você aceita uma xicara de café?",
                "Escolha um",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opts,
                opts[0]
        );
        if (escolha == 0){
            JOptionPane.showMessageDialog(null,
                    "Lepoo");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nasce de novo!");
        }

        Random r = new Random();
        int numero = r.nextInt(3);
        System.out.println("Sorteado: " +  numero);
    }
}
