import javax.swing.*;

public class Imc {
    public static void main(String[] args) {
        Double imc;
        Double peso;
        Double altura;

        String input1 = JOptionPane.
                showInputDialog("Digite seu peso (KG)");
        String input2 = JOptionPane.
                showInputDialog("Digite a altura (MT)");

        peso = Double.parseDouble(input1);
        altura = Double.parseDouble(input2);
        altura = altura / 100;
        imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);

    }
}
