package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class PagamentoBoleto extends PagamentoChain {

    public PagamentoBoleto() {
        super(FormasPagamento.boleto);
    }

    @Override
    protected float efetuaPagamento(VendaSingleton v) {
        float valor = v.getValor();
        float ret = valor + 4.5f;
        System.out.println("Pagamento efetuado com Boleto com acréscimo de R$ 4,50");
        System.out.println("Valor da Compra: " + valor + "\nValor do pagamento: " + ret);
        return ret;
    }
}
