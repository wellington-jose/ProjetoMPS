package Business.Control;

import Business.Model.VendaSingleton;
import Infra.Pagamento.CartaoTipo;
import Infra.Pagamento.CartaoVisa;
import Infra.Pagamento.FormasPagamento;
import Infra.Pagamento.PagamentoBoleto;
import Infra.Pagamento.PagamentoChain;
import Infra.Pagamento.PagamentoCheque;
import Infra.Pagamento.PagamentoCredito;
import Infra.Pagamento.PagamentoDebito;
import Infra.Pagamento.PagamentoDinheiro;
import Util.Exception.PagamentoInvalidoException;

/**
 *
 * @author Carlinhos
 */
public class ControlPagamento {

    PagamentoChain pagamentos;
    VendaSingleton venda;
    CartaoTipo cartaoTipo;

    public ControlPagamento() {
        pagamentos = new PagamentoDinheiro();

    }

    public void addicionarFormasPagamentos(CartaoTipo t) {
//        pagamentos.setNext(new PagamentoDinheiro());
        pagamentos.setNext(new PagamentoCheque());
        pagamentos.setNext(new PagamentoDebito(t));
        pagamentos.setNext(new PagamentoCredito(t));
        pagamentos.setNext(new PagamentoBoleto());
    }

//    public float efetuarPagamento(FormasPagamento forma, VendaSingleton v, CartaoTipo t) {
//        this.addicionarFormasPagamentos(t);
//        try {
//            return pagamentos.efetuarPagamento(forma, v);
//        } catch (PagamentoInvalidoException e) {
//            System.out.println("Paramento inexistente");
//        }
//        return 0;
//
//    }

    public float efetuarPagamento(FormasPagamento forma, VendaSingleton v) {
        this.addicionarFormasPagamentos(cartaoTipo);
        try {
            return pagamentos.efetuarPagamento(forma, v);
        } catch (PagamentoInvalidoException e) {
            System.out.println("Paramento inexistente");
        }
        return 0;
    }

    public void tipoCartao(CartaoTipo t) {
        this.cartaoTipo = t;
    }
}
