package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class PagamentoDebito extends PagamentoChain {

    CartaoTipo tipo;

    public PagamentoDebito(CartaoTipo t) {
        super(FormasPagamento.debito);
        this.tipo = t;
    }

    @Override
    protected float efetuaPagamento(VendaSingleton v) {
        float valor = v.getValor();
        v.setDesconto(5);
        float ret = v.getValor();
        System.out.println("Pagamento efetuado com cartão de débido com 5% de desconto");
        System.out.println("Valor da Compra: " + valor + "\nValor do pagamento: " + ret);
        tipo.processarCompra(v);
        return ret;

    }
}
