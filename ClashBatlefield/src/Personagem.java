public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataqueBase;
    private Arma arma;

    public Personagem(String nome, int vida, int ataqueBase) {
        this.nome = nome;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
    }

    public void equiparArma(Arma arma){
        this.arma = arma;
        System.out.println(nome+" equipou a arma "+arma.getNome());
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void receberDano(int dano){
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.print(nome + " recebeu " + dano + " de dano. ");
        System.out.println("Vida atual: " + vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public abstract int atacar();
}
