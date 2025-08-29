public class Aluno {
    // PUBLIC - é visivel em qualquer lugar
    public String nome;
    public Double b1;
    public Double b2;
    // PRIVATE - é visivel apenas dentro da classe
    private String ra;
    // PROTECTED - é visivel dentro do pacote
    protected String curso;

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }
}
