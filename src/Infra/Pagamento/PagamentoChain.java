package Infra.Pagamento;

import Business.Model.VendaSingleton;
import Util.Exception.PagamentoInvalidoException;

/**
 *
 * @author wellington
 */
public abstract class PagamentoChain {

    protected PagamentoChain next;
    protected FormasPagamento ID_Pagamento;

    public PagamentoChain(FormasPagamento id) {
        next = null;
        ID_Pagamento = id;
    }

    public void setNext(PagamentoChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }

    public float efetuarPagamento(FormasPagamento id, VendaSingleton v) throws PagamentoInvalidoException {
        float ret = 0;
        if (podeEfetuarPagamento(id)) {
            ret = efetuaPagamento(v);
        } else {
            if (next == null) {
                throw new PagamentoInvalidoException("Tipo de pagamento inexistente");
            }
            next.efetuarPagamento(id, v);
        }

        return ret;
    }

    private boolean podeEfetuarPagamento(FormasPagamento id) {
        if (ID_Pagamento == id) {
            return true;
        }
        return false;
    }

    protected abstract float efetuaPagamento(VendaSingleton v);
}
