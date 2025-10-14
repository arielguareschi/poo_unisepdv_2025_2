import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    private static ArrayList<Pizza> cardapio = new ArrayList<>();
    private static Pedido pedidoAtual = new Pedido();

    private static final String MENU = "" +
            "Menu Principal\n" +
            "1 - Cadastrar Pizza\n" +
            "2 - Listar Pizzas\n" +
            "3 - Realizar Pedido (adicionar pizza)\n" +
            "4 - Ver Total do Pedido\n" +
            "5 - Imprimir Pedido\n" +
            "6 - Definir/Alterar Cliente do Pedido\n" +
            "7 - Remover item do Pedido\n" +
            "0 - Sair\n";

    public static void main(String[] args) {
        // Cardápio inicial (exemplos)
        if (cardapio.isEmpty()) {
            cardapio.add(new Pizza("Mussarela", "Média", 45.0));
            cardapio.add(new Pizza("Calabresa", "Grande", 55.0));
            cardapio.add(new Pizza("Frango c/ Catupiry", "Média", 52.0));
        }

        while (true) {
            String opcaoStr = JOptionPane.showInputDialog(null, MENU, "Pizzaria", JOptionPane.QUESTION_MESSAGE);
            if (opcaoStr == null) {
                // Usuário cancelou: confirmar saída
                int c = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
                if (c == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    continue;
                }
            } int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarPizza();
                    break;
                case 2:
                    listarPizzas();
                    break;
                case 3:
                    realizarPedido();
                    break;
                case 4:
                    verTotal();
                    break;
                case 5:
                    imprimirPedido();
                    break;
                case 6:
                    definirCliente();
                    break;
                case 7:
                    removerItemPedido();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void cadastrarPizza() {
        String sabor = JOptionPane.showInputDialog(null, "Informe o sabor:");
        if (sabor == null || sabor.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
            return;
        }
        String tamanho = JOptionPane.showInputDialog(null, "Informe o tamanho (P/M/G):", "M");
        if (tamanho == null || tamanho.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
            return;
        }
        String precoStr = JOptionPane.showInputDialog(null, "Informe o preço (ex: 49.90):");
        if (precoStr == null) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
            return;
        }
        try {
            double preco = Double.parseDouble(precoStr.replace(",", "."));
            Pizza p = new Pizza(sabor.trim(), tamanho.trim(), preco);
            cardapio.add(p);
            JOptionPane.showMessageDialog(null, "Pizza cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço inválido.");
        }
    }

    private static void listarPizzas() {
        if (cardapio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há pizzas cadastradas no cardápio.");
            return;
        }
        StringBuilder sb = new StringBuilder("Cardápio:\n");
        for (int i = 0; i < cardapio.size(); i++) {
            sb.append(i).append(" - ").append(cardapio.get(i).toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void realizarPedido() {
        if (cardapio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cadastre pizzas no cardápio antes de realizar o pedido.");
            return;
        }
        if (pedidoAtual == null) {
            pedidoAtual = new Pedido();
        }

        while (true) {
            listarPizzas();
            String idxStr = JOptionPane.showInputDialog(null, "Informe o índice da pizza para adicionar (ou deixe vazio para encerrar):");
            if (idxStr == null || idxStr.trim().isEmpty()) break;
            try {
                int idx = Integer.parseInt(idxStr.trim());
                if (idx < 0 || idx >= cardapio.size()) {
                    JOptionPane.showMessageDialog(null, "Índice fora do intervalo.");
                    continue;
                }
                // Adiciona uma cópia simples (para evitar acoplar ao cardápio diretamente)
                Pizza ref = cardapio.get(idx);
                Pizza item = new Pizza(ref.getSabor(), ref.getTamanho(), ref.getPreco());
                pedidoAtual.addItem(item);
                JOptionPane.showMessageDialog(null, "Item adicionado ao pedido.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Índice inválido.");
            }
        }
    }

    private static void verTotal() {
        if (pedidoAtual == null || pedidoAtual.getItems().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há itens no pedido.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Total do pedido: R$ " + String.format("%.2f", pedidoAtual.getTotal()));
    }

    private static void imprimirPedido() {
        if (pedidoAtual == null || pedidoAtual.getItems().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há itens no pedido.");
            return;
        }
        JOptionPane.showMessageDialog(null, pedidoAtual.toString());
    }

    private static void definirCliente() {
        if (pedidoAtual == null) {
            pedidoAtual = new Pedido();
        }
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente:", pedidoAtual.getCliente());
        if (nome != null && !nome.trim().isEmpty()) {
            pedidoAtual.setCliente(nome.trim());
            JOptionPane.showMessageDialog(null, "Cliente definido para o pedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido. Mantido o valor atual.");
        }
    }

    private static void removerItemPedido() {
        if (pedidoAtual == null || pedidoAtual.getItems().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há itens no pedido.");
            return;
        }
        StringBuilder sb = new StringBuilder("Itens do pedido:\n");
        for (int i = 0; i < pedidoAtual.getItems().size(); i++) {
            sb.append(i).append(" - ").append(pedidoAtual.getItems().get(i)).append("\n");
        }
        String idxStr = JOptionPane.showInputDialog(null, sb.toString() + "\nInforme o índice para remover:");
        if (idxStr == null || idxStr.trim().isEmpty()) return;
        try {
            int idx = Integer.parseInt(idxStr.trim());
            boolean ok = pedidoAtual.removeItem(idx);
            if (ok) JOptionPane.showMessageDialog(null, "Item removido.");
            else JOptionPane.showMessageDialog(null, "Índice inválido.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }
}
