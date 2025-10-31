package exceptions;

public class LoginException extends Exception {
    public LoginException(String email, String senha, String msg){
        super("Erro ao fazer login: " + msg +
                "\nEmail: " + email +
                "\nSenha: " + senha);
    }
}
