import java.util.ArrayList;

public class Pedido {
    private String cliente;
    private ArrayList<Pizza> items;

    public Pedido(){
        this.items = new ArrayList<>();
        this.cliente = "CONSUMIDOR";
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.trim().isEmpty()) return;
        this.cliente = cliente.trim();
    }

    public void addItem(Pizza p){
        if (p != null){
            this.items.add(p);
        }
    }

    public boolean removeItem(int index){
        if (index >= 0 && index < this.items.size()){
            this.items.remove(index);
            return true;
        }
        return false;
    }

    public ArrayList<Pizza> getItems(){
        return this.items;
    }

    public double getTotal(){
        double total = 0.0;
        for(Pizza item : this.items){
            if (item != null && item.getPreco() != null){
                total += item.getPreco();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder t = new StringBuilder();
        t.append("Impressão do pedido\n");
        t.append("Cliente: ").append(this.cliente).append("\n");
        t.append("Pizzas no pedido:\n");
        for(Pizza item : this.items){
            t.append(item.toString()).append("\n");
        }
        t.append("Total: R$ ").append(String.format("%.2f", this.getTotal()));
        return t.toString();
    }
}
