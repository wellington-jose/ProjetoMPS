package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class PagamentoDinheiro extends PagamentoChain {

    public PagamentoDinheiro() {
        super(FormasPagamento.dinheiro);
    }

    @Override
    protected float efetuaPagamento(VendaSingleton v) {
        float valor = v.getValor();
        v.setDesconto(10);
        float ret = v.getValor();
        System.out.println("Pagamento efetuado em dinheiro com 10% de desconto");
        System.out.println("Valor da Compra: " + valor + "\nValor do pagamento: " + ret);
        return ret;

    }
}
