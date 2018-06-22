package Business.Model;

/**
 *
 * @author wellington
 */
public class VendaNumero {

    protected static int idVenda;
    public static VendaNumero instancia;

    protected VendaNumero() {
    }

    // cria só uma instância e incrementa sempre o idVenda.
    public static VendaNumero getInstancia() {
        idVenda++;
        if (instancia == null) {
            instancia = new VendaNumero();
        }
        return instancia;
    }

    public int getIdVenda() {
        return idVenda;
    }

}
