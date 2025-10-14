public class Construcao extends Personagem{

    public Construcao(String nome) {
        super(nome, 120, 15);
    }

    @Override
    public int atacar() {
        int poder = 0;
        if (getArma() != null){
            poder = getArma().getPoder();
        }
        int dano = getAtaqueBase() + poder;
        System.out.println(getNome() +
                " deu uma martelada  e causou " + dano +
                " de dano.");
        return dano;
    }
}
