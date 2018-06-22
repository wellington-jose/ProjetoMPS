package Business.Model;

/**
 *
 * @author wellington
 */
public class Produto {

    private final String id;
    private String descricao;
    private String nome;
    private float preco;

    public Produto(String des, String nome, float p) {
        this(null, des, nome, p);
    }

    public Produto(String id, String des, String nome, float p) {
        this.descricao = des;
        this.nome = nome;
        this.id = id;
        this.preco = p;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
