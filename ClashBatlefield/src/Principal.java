public class Principal {
    public static void main(String[] args) {
        Construcao c1 = new Construcao("Batman");
        Feitico f1 = new Feitico("Hary Pote");
        Tropa t1 = new Tropa("Ahnn Oruam");

        Arma a1 = new Arma("Troques Monstra", 15);
        Arma a2 = new Arma("Vara de Marmelo", 10);
        Arma a3 = new Arma("Musica", 0);

        c1.equiparArma(a1);
        f1.equiparArma(a2);
        t1.equiparArma(a3);

        Batalha batalha = new Batalha(c1, t1);
        Personagem vencedor = batalha.iniciar();
        // depois o vencedor batalhar com o outro.
        batalha = new Batalha(vencedor, f1);
        batalha.iniciar();
    }
}
