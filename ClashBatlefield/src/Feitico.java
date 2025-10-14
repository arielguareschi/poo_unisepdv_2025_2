import java.util.Random;

public class Feitico extends Personagem{

    public Feitico(String nome) {
        super(nome, 100, 10);
    }
    @Override
    public int atacar() {
        int poder = 0;
        if (getArma() != null){
            poder = getArma().getPoder();
        }
        Random random = new Random();
        int bonus = random.nextInt(10) + 5;
        int dano = getAtaqueBase() + bonus + poder;
        System.out.println(getNome() +
                " usou sua varinha e causou " + dano + " de dano.");
        return dano;
    }
}
