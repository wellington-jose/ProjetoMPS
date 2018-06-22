package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public interface CartaoTipo {
    void processarCompra(VendaSingleton venda);
}
