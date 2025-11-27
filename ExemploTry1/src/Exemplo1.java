import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        try {
            int idade = Integer.parseInt(s.nextLine());
            System.out.println("Voce tem " + idade + " anos.");
        } catch(NumberFormatException e){
            System.out.println("Erro na leitura do teclado."
                    + e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do programa.");
    }
}
