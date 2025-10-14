import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Despesa> despesas = new ArrayList<>();
        despesas.add(new Despesa("Combustivel", 6.34,
                6.59, true));
        despesas.add(new Despesa("Revisao", 1200.0,
                10000.0, true));
        despesas.add(new Despesa("Pneu", 2000.0,
                45000.0, true));
        despesas.add(new Despesa("IPVA", 7500.0,
                1.0, false));
        despesas.add(new Despesa("Licenciamento",
                150.0, 1.0, false));
        despesas.add(new Despesa("Seguro",
                4000.0, 1.0, false));

        Double vlrKm = 0.0;
        for (Despesa despesa : despesas) {
            vlrKm += despesa.calculaValorKm();
        }
        System.out.println("Valor total de Km: " + vlrKm);
    }
}
