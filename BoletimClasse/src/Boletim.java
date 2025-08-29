public class Boletim {

    public static void main(String[] args) {
        // INSTANCIAR UMA CLASSE
        // aqui a CLASSE Aluno vira um
        // objeto aluno
        Aluno aluno = new Aluno();
        aluno.nome = "Tiburso";
        aluno.b1 = 5.0;
        aluno.b2 = 7.0;
        aluno.setRa("2025df1a");

        System.out.println(aluno.getRa());
    }
}
