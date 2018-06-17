package Business.Model;

/**
 *
 * @author wellington
 */
public class Usuario {

    private String cpf;
    private String login;
    private String senha;

    public Usuario(String c, String l, String s) {
        this.cpf = c;
        this.login = l;
        this.senha = s;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
