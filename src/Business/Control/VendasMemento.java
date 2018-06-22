package Business.Control;

import Business.Model.VendaIndividual;

/**
 *
 * @author wellington
 */
public class VendasMemento {

    protected VendaIndividual venda;

    public VendasMemento(VendaIndividual v) {
        venda = v;
    }

    public VendaIndividual getVenda() {
        return venda;
    }
}
