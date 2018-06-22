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
public class TesteSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlPagamento control = new ControlPagamento();
        VendaSingleton v;

        v = new VendaSingleton("1111", "Cliente A", 100, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente B", 500, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente C", 100, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente D", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente E", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente F", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente G", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente H", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

        v = new VendaSingleton("1111", "Cliente I", 400, "000");
        System.out.println("Nota Fiscal nº " + v.getIdNotaFiscal() + " - " + v.getIdCliente());

    }

}
