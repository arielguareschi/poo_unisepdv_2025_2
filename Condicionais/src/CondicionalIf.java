public class CondicionalIf {
    public static void main(String[] args) {
        int nota = 5;
        int media = 7;

        if (nota >= media) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        boolean existe = true;
        boolean aprovado = nota >= media;

        if (existe){
            System.out.println("Existe");
        }

        int num = 10;
        if (num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        String nome = "Maria";
        String nome2 = "maria";

        if (nome.equalsIgnoreCase(nome2)){
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        if (!nome.equals(nome2)){
            System.out.println("igual");
        } else if (!aprovado){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
        
        /*
          ! - indica um negacao
          || = comparador OR / OU
          && = comparador AND / E
         */
    }
}
