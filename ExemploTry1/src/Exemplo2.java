import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("D:\\Fontes\\poo_unisepdv_2025_2\\ExemploTry1\\src\\config.txt"))){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e){
            System.err.println("Erro ao abrir arquivo!\n" +
                    e.getMessage());
        }
    }
}
