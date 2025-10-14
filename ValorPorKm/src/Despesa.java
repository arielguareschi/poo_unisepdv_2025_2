public class Despesa {

    private String descricao;
    private Double valor;
    private Double km;
    private boolean porKm;

    public Despesa() {
    }

    public Despesa(String descricao, Double valor, Double km, boolean porKm) {
        this.descricao = descricao;
        this.valor = valor;
        this.km = km;
        this.porKm = porKm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public boolean isPorKm() {
        return porKm;
    }

    public void setPorKm(boolean porKm) {
        this.porKm = porKm;
    }

    public Double calculaValorKm(){
        Double km = this.km;
        if (!this.porKm){
            km = 1500 * 12 * this.km;
        }
        return this.valor / km;
    }
}
