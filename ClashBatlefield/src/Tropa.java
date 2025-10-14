import java.util.Random;

public class Tropa extends Personagem{

    public Tropa(String nome) {
        super(nome, 75, 5);
    }
    @Override
    public int atacar() {
        int poder = 0;
        if (getArma() != null){
            poder = getArma().getPoder();
        }
        Random random = new Random();
        int mortos = random.nextInt(10) * 2 ;
        int dano = getAtaqueBase() + poder - mortos;
        System.out.println(getNome() +
                " deu uns tiros e causou " + dano + " de dano.");
        return dano;
    }
}
