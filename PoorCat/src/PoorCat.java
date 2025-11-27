import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PoorCat {

    private static final Double CUSTO_GIRO = 2.00;
    private static final List<String> SIMBOLOS = Arrays.
            asList("Casa", "Sino", "Estrela", "Gato", "Coringa",
                    "Aviao");

    private static String sorteia(Random rng) {
        int max = SIMBOLOS.size();
        int sorteado = rng.nextInt(max);
        return SIMBOLOS.get(sorteado);
        //return SIMBOLOS.get(rng.nextInt(SIMBOLOS.size()));
    }

    private static Double calculaPremio(String a, String b, String c) {
        // 3x Coringa paga 50x
        if (a.equalsIgnoreCase("Coringa") &&
                b.equalsIgnoreCase("Coringa") &&
                c.equalsIgnoreCase("Coringa")) {
            return 50 * CUSTO_GIRO;
        }
        // 3 iguais de qualquer outro paga 10x
        if (a.equalsIgnoreCase(b) && b.equalsIgnoreCase(c)) {
            return 10 * CUSTO_GIRO;
        }
        // 2 iguais paga 3x
        if (a.equalsIgnoreCase(b) || a.equalsIgnoreCase(c) ||
                b.equalsIgnoreCase(c)) {
            return 3 * CUSTO_GIRO;
        }
        return 0.0;
    }

    private static Double lerSaldo(Scanner sc) {
        while (true) {
            System.out.println("Digite o saldo inicial: ");
            Double saldo = sc.nextDouble();
            if (saldo >= CUSTO_GIRO) {
                return saldo;
            } else {
                System.out.println("O saldo deve ser maior que " +
                        CUSTO_GIRO);
            }
        }
    }

    private static int lerGiros(Scanner sc) {
        while (true) {
            System.out.println("Quantos Giros: ");
            int giros = sc.nextInt();
            if (giros > 0) {
                return giros;
            } else {
                System.out.println("Digite um numero positivo");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O gatinho esta pagando!");
        Double saldo = lerSaldo(sc);
        int girosDesejados = lerGiros(sc);
        System.out.println("Simbolos disponiveis: " +
                SIMBOLOS);
        System.out.println("Custo de giro: " +
                CUSTO_GIRO);
        int girosEfetuados = 0;
        Random rng = new Random();
        while (girosEfetuados < girosDesejados &&
                saldo >= CUSTO_GIRO) {
            girosEfetuados++;
            saldo -= CUSTO_GIRO;

            String a = sorteia(rng);
            String b = sorteia(rng);
            String c = sorteia(rng);

            Double premio = calculaPremio(a, b, c);
            saldo += premio;

            String resultado = "Giro: " + girosEfetuados +
                    ": Sorteado: (" + a + ") (" + b + ") (" + c + ")";

            String detalhe;
            if (a.equalsIgnoreCase("coringa") &&
                    b.equalsIgnoreCase("coringa") &&
                    c.equalsIgnoreCase("coringa")) {
                detalhe = "JAQUEPOTE! 3X + " + premio;
            } else if (a.equals(b) && b.equals(c)) {
                detalhe = "TRINCA! + " + premio;
            } else if (a.equals(b) ||
                    a.equals(c) || b.equals(c)) {
                detalhe = "PAR! + " + premio;
            } else {
                detalhe = "PERDEU! - " + CUSTO_GIRO;
            }

            System.out.println(resultado + " - " + detalhe +
                    " | Saldo: " + saldo);
        }
        System.out.println("Giros realizados: " + girosEfetuados);
        System.out.println("Giros desejados: " + girosDesejados);
        if (saldo < CUSTO_GIRO && girosEfetuados < girosDesejados) {
            System.out.println("sem saldo para os giros desejados");
        }
        System.out.println("Saldo final: " + saldo);
        System.out.println("Volte depois para perder mais bocó!");
    }
}
