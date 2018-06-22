package Infra.Pagamento;

import Business.Model.VendaSingleton;

/**
 *
 * @author wellington
 */
public class CartaoVisa implements CartaoTipo {

    @Override
    public void processarCompra(VendaSingleton venda) {
        System.out.println( venda.formaPagamento() + " com o Cartão Visa");
    }

}
