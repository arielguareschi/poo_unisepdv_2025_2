public class Pizza {
    private String sabor;
    private String tamanho;
    private Double preco;

    public Pizza(){
        this.preco = 50.0;
    }

    public Pizza(String sabor, String tamanho, Double preco){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Sabor: " + this.sabor +
                " - Tamanho: " + this.tamanho +
                " - R$: " + this.preco;
    }
}
