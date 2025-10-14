import java.util.Scanner;

public class Mensalidade {
    /*
    Desenvolva uma aplicação que informe o valor da mensalidade
    e quantos dias na semana corresponde,
    calcule o custo de cada hora.
    Considere que o mes tem 4 semanas e cada dia são 4 horas.
    Ao final exiba qual é o valor da hora e o valor do dia
    relativo a mensalidade informada.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da mensalidade: ");
        Double valorMensalidade = entrada.nextDouble();
        System.out.println("Informe quantos dias na semana: ");
        int diasSemana = entrada.nextInt();
        Double valorDia = valorMensalidade / 4 / diasSemana;
        Double valorHora = valorDia / 4;
        System.out.println("Valor do dia: " + valorDia);
        System.out.println("Valor da hora: " + valorHora);

    }
}
