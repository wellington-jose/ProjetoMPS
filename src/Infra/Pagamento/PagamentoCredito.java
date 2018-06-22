package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class PagamentoCredito extends PagamentoChain {

    CartaoTipo tipo;

    public PagamentoCredito(CartaoTipo t) {
        super(FormasPagamento.credito);
        this.tipo = t;
    }

    @Override
    protected float efetuaPagamento(VendaSingleton v) {
        float valor = v.getValor();
        System.out.println("Pagamento efetuado com cartão de crédito, sem desconto");
        System.out.println("Valor da Compra: " + valor + "\nValor do pagamento: " + valor);
        tipo.processarCompra(v);
        return valor;

    }
}
