public class Batalha {
    private final Personagem p1;
    private final Personagem p2;
    public Batalha(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Personagem iniciar(){
        System.out.println("====== PREPAREM AS ARMAS ==========");
        System.out.println(p1.getNome() + " vs " + p2.getNome());
        System.out.println("VAO INCIAR UMA BATALHA SANGRENTA!");
        System.out.println("===== LUTEM!!! =====");
        int turno = 1;

        while(p1.estaVivo() && p2.estaVivo()){
            System.out.println("\nRound " + turno + "\n");
            int dano1 = p1.atacar();
            p2.receberDano(dano1);
            if (!p2.estaVivo()){
                break;
            }
            int dano2 = p2.atacar();
            p1.receberDano(dano2);
            turno++;
        }
        System.out.println("===== FATALITY!!! =====");
        if (p1.estaVivo()){
            System.out.println(p1.getNome() + " ganhou!");
            return p1;
        } else {
            System.out.println(p2.getNome() + " ganhou!");
            return p2;
        }
    }
}
