public class Exemplo3 {

    public static void sacar(Double saldo, Double valor) throws Exception {
        if (saldo < valor){
            throw new Exception("Sem saldo!");
        }
        System.out.println("Saque realizado com sucesso!");
    }

    public static void main(String[] args) {
        Double saldo = 1000.0;
        try {
            sacar(saldo, 2000.0);
        } catch (Exception e){
            System.err.println("Erro no saque!\n" + e.getMessage());
        }
    }
}
