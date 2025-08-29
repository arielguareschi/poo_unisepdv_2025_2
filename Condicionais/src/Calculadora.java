import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        // informar dois numeros e a operacao
        String input1 = JOptionPane
                .showInputDialog("Digite um número");
        String input2 = JOptionPane
                .showInputDialog("Outro número");
        String operacao = JOptionPane
                .showInputDialog("Operação (+ - * / )");
        Double numero1 = Double.parseDouble(input1);
        Double numero2 = Double.parseDouble(input2);
        Double resultado = 0.0;
        if (operacao.equals("+")){
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")){
            resultado = numero1 - numero2;
        } else if (operacao.equals("*")){
            resultado = numero1 * numero2;
        } else if (operacao.equals("/")){
            resultado = numero1 / numero2;
        }
        JOptionPane.showMessageDialog(
                null,
                "Resultado: " + resultado);
    }
}
