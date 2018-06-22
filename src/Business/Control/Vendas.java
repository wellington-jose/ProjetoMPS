package Business.Control;

import Business.Model.VendaIndividual;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
public class Vendas {

    protected VendaIndividual state;
    VendasCareTaker caretaker;

    public Vendas() {
        caretaker = new VendasCareTaker();
        state = new VendaIndividual("INICIAL", 0, 0);
    }

    public void set(VendaIndividual novaVenda) {
        caretaker.adicionarMemento(new VendasMemento(novaVenda));
        System.out.println("Modificando " + this.state.getProd()
                + " para " + novaVenda.getProd());
        state = novaVenda;
    }

    public void desfazerVenda() {
        VendasMemento vm = caretaker.getUltimoEstadoSalvo();
        if (vm != null) {
            VendaIndividual stateAtual = this.state;
            state = vm.getVenda();
            System.out.println("Desfazendo a venda do produto: " + state.getProd());
        }
    }

    public void desfazerVenda(int indice) {
        VendasMemento vm = caretaker.getEstadoSalvo(indice);
        if (vm != null) {
            VendaIndividual stateAtual = this.state;
            state = vm.getVenda();
            System.out.println("Desfazendo a venda do produto: " + state.getProd());
        }
    }

    public void imprimir() {
        caretaker.imprimir();
    }

    public List<VendaIndividual> getVenda() {
        List<VendaIndividual> listaVenda = new ArrayList<>();

        for (VendasMemento vn : caretaker.getEstados()) {
            listaVenda.add(vn.getVenda());
        }
        return listaVenda;
    }
}
