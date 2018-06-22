package Business.Control;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
public class VendasCareTaker {

    protected List<VendasMemento> estados;

    public VendasCareTaker() {
        estados = new ArrayList<VendasMemento>();
    }

    public void adicionarMemento(VendasMemento memento) {
        estados.add(memento);
    }

    public VendasMemento getEstadoSalvo(int indice) {
        if (!estados.isEmpty()) {
            return estados.remove(indice);
        } else {
            return null;
        }
    }

    public VendasMemento getUltimoEstadoSalvo() {
        return this.getEstadoSalvo(estados.size() - 1);
    }

    public void imprimir() {
        for (VendasMemento v : estados) {
            System.out.println(v.getVenda().getProd());
        }
    }
    
    public List<VendasMemento> getEstados(){
        return estados;
    }
}
