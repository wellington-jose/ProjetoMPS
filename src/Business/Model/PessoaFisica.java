package Business.Model;

/**
 *
 * @author wellington
 */
public class PessoaFisica {

    private String cpf;
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private boolean cadastro;

    public PessoaFisica() {
        this.cadastro = false;
    }

    public PessoaFisica(String c, String n, String d, String e, String t, String em) {
        this.cpf = c;
        this.nome = n;
        this.dataNascimento = d;
        this.endereco = e;
        this.telefone = t;
        this.email = em;
        this.cadastro = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return nome + ", " + cpf + ", " + dataNascimento + ", " + endereco + ", "
                + telefone + ", " + email;
    }

}
