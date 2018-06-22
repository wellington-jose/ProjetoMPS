package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class PagamentoCheque extends PagamentoChain {

    public PagamentoCheque() {
        super(FormasPagamento.cheque);
    }

    @Override
    protected float efetuaPagamento(VendaSingleton v) {
        float valor = v.getValor();
        System.out.println("Pagamento efetuado com cheque sem desconto");
        System.out.println("Valor da Compra: " + valor + "\nValor do pagamento: " + valor);
        return valor;

    }
}
