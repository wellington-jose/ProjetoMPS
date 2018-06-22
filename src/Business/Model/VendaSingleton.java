package Business.Model;

/**
 *
 * @author wellington
 */

/*
Table: venda
Columns:
id_venda int(11) AI PK 
data_venda date 
cliente_venda int(11) 
valor_venda int(11) 
funcionario_venda int(11)
 */
public class VendaSingleton {

    private String data, idCliente, idFuncionario;
    private float valor;
    private int desconto;
    protected int idNotaFiscal;
    private VendaNumero nv;
    

    
    public VendaSingleton(String idNT, String dt, String c, float vlr, String func) {
        this.idNotaFiscal = Integer.parseInt(idNT);
        this.data = dt;
        this.idCliente = c;
        this.valor = vlr;
        this.idFuncionario = func;
        this.desconto = 0;
    }
    
    public VendaSingleton(String dt, String c, float vlr, String func) {
        this.data = dt;
        this.idCliente = c;
        this.valor = vlr;
        this.idFuncionario = func;
        nv = VendaNumero.getInstancia();
        this.idNotaFiscal = nv.getIdVenda();
    }

    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public String getData() {
        return data;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public float getValor() {
        valor = this.setValor();
        return valor;
    }

    private float setValor() {
        float ind = (this.getDesconto() / 100.0f);
        float ret = valor - (valor * ind);
        return ret;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String formaPagamento() {
        String ret = idCliente + " pagou " + valor + " de compras";
        return ret;
    }
}
