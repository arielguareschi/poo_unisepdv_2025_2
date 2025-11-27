public class Main {
    /*
    Criar uma calculadora de salario onde tera o
    salario bruto, o percentual de inss, o
    percentual de IR, e ao final exibira
    detalhadamente qual o salario liquido.
    SAIDA:
    Salário Bruto: R$ 5.000,00
    % INSS (11.5%): R$ 250,00
    % IR (27.5%): R$ 550,00
    Salário Liquído: R$ 4,100,00
    BASE_INSS = S.B.
    BASE_IR = S.B. - VLR_INSS
     */

    public static void main(String[] args) {
        Double salarioBruto = 5000.00;
        Double perInss = 11.5;
        Double perIr = 27.5;
        Double vlrInss = salarioBruto * perInss / 100;
        Double baseIR = salarioBruto - vlrInss;
        Double vlrIr = baseIR * perIr / 100;
        Double salarioLiquido = salarioBruto -
                vlrInss - vlrIr;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("% INSS ("+perInss+"%): R$ " + vlrInss);
        System.out.println("% IR ("+perIr+"%): R$ " + vlrIr);
        System.out.println("Salário Liquído: R$ " + salarioLiquido);

        int[] valores = new int[5];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;
        System.out.println(valores[1]);

        int[][] notas = new int[2][2];
        notas[0][0] = 1;
        notas[0][1] = 9;
        notas[1][0] = 8;
        notas[1][1] = 7;
        System.out.println(notas[1][0]);
    }
}
