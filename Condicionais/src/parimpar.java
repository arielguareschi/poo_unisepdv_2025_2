import javax.swing.*;

public class parimpar {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um numero");
        int limite = Integer.parseInt(input);
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0){
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
        }
    }
}
