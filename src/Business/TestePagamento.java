package Business;

import Business.Control.ControlPagamento;
import Business.Model.VendaSingleton;
import Infra.Pagamento.CartaoHipercard;
import Infra.Pagamento.CartaoTipo;
import Infra.Pagamento.CartaoVisa;
import Infra.Pagamento.FormasPagamento;

/**
 *
 * @author wellington
 */
public class TestePagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlPagamento control;
        CartaoTipo t1 = new CartaoVisa();
        CartaoTipo t2 = new CartaoHipercard();
        VendaSingleton v;

        control = new ControlPagamento();
        v = new VendaSingleton("1111", "Cliente A", 100, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal());
        control.efetuarPagamento(FormasPagamento.dinheiro, v);
        System.out.println("==============================================");

        control = new ControlPagamento();
        v = new VendaSingleton("1111", "Cliente A", 500, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal());
        control.efetuarPagamento(FormasPagamento.cheque, v);
        System.out.println("==============================================");

        control = new ControlPagamento();
        v = new VendaSingleton("1111", "Cliente A", 100, "000");
        control.tipoCartao(t2);
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal());
        control.efetuarPagamento(FormasPagamento.credito, v);
        System.out.println("==============================================");

        control = new ControlPagamento();
        v = new VendaSingleton("1111", "Cliente A", 400, "000");
        control.tipoCartao(t1);
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal());
        control.efetuarPagamento(FormasPagamento.debito, v);
        System.out.println("==============================================");

    }

}
