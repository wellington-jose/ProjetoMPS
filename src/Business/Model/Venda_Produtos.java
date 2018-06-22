package Business.Model;

/**
 *
 * @author wellington
 */

/*
id_produtocompra int(11) AI PK 
notafiscal_produtocompra varchar(30) 
produto_produtocompra int(5) 
valorunitario_produtocompra int(11) 
quantidade_produtocompra int(5) 
valortotal_produtocompra int(11)
 */
public class Venda_Produtos {

    private String idNotaFiscal, idProduto;
    private float valorUnitario;
    private float valorTotal;
    private int quantidade;

    public Venda_Produtos(String idNT, String idP, float vu, int quant) {
        this.idNotaFiscal = idNT;
        this.idProduto = idP;
        this.valorUnitario = vu;
        this.quantidade = quant;
        this.valorTotal = valorUnitario * quantidade;
    }

    public Venda_Produtos() {
    }

    public String getIdProduto() {
        return idProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getIdNotaFiscal() {
        return idNotaFiscal;
    }
}
