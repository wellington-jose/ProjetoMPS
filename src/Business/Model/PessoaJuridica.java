package Business.Model;

/**
 *
 * @author wellington
 */
public class PessoaJuridica {

    private String cnpj;
    private String nome;
    private String responsavel;
    private String endereco;
    private String telefone;
    private String email;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String c, String n, String r, String e, String t, String em) {
        this.cnpj = c;
        this.nome = n;
        this.responsavel = r;
        this.endereco = e;
        this.telefone = t;
        this.email = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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

    @Override
    public String toString() {
        return nome + ", " + cnpj + ", " + responsavel + ", " + endereco + ", "
                + telefone + ", " + email;
    }
}
