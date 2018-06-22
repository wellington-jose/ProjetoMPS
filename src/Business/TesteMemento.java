package Business;

import Business.Control.Vendas;
import Business.Control.VendasCareTaker;
import Business.Model.VendaIndividual;

/**
 *
 * @author wellington
 */
public class TesteMemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendaIndividual v1 = new VendaIndividual("PAPEL", 10, 2);
        VendaIndividual v2 = new VendaIndividual("PLACA", 10, 2);
        VendaIndividual v3 = new VendaIndividual("ADESIVO", 10, 2);
        VendaIndividual v4 = new VendaIndividual("FITA", 10, 2);
        VendaIndividual v5 = new VendaIndividual("DESENHO", 10, 2);
        VendaIndividual v6 = new VendaIndividual("FOTO", 10, 2);

        Vendas venda = new Vendas();

        venda.set(v1);
        venda.set(v2);
        venda.set(v3);
        venda.set(v4);
        venda.set(v5);
        venda.set(v6);

        System.out.println("=========================");
        venda.imprimir();
        System.out.println("=========================");
        for (int i = 0; i < 70; i++) {
            venda.desfazerVenda();
        }

        System.out.println("=========================");
        venda.imprimir();
        System.out.println("=========================");
    }

}
