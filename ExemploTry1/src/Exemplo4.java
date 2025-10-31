import exceptions.LoginException;

public class Exemplo4 {
    public static void main(String[] args) {
        try{
            autenticar("admin@a.com.br", "123");
        } catch (LoginException e){
            System.err.println(e.getMessage());
        }
    }
    public static void autenticar(
            String email, String senha) throws LoginException{
        if (!email.equals("admin") && !senha.equals("admin")){
            throw new LoginException(email, senha, "Login invalido");
        }
        System.out.println("Login realizado com sucesso!");
    }
}
