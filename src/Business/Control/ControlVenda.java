package Business.Control;

import Business.Model.VendaSingleton;
import Infra.BD.VendasBDAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ControlVenda {

    VendasBDAdapter prodBD;

    public ControlVenda() {
        prodBD = new VendasBDAdapter();
    }

    public void salvarDados(VendaSingleton p) throws SQLException {
        prodBD.salvarDados(p);
    }

    public void removerDados(String id) throws SQLException {
        prodBD.removerDados(id);

    }

    public void atualizarDados(VendaSingleton p) throws SQLException {
        prodBD.atualizaDados(p);

    }

    public VendaSingleton listarUsuario(String id) throws SQLException {
        return (VendaSingleton) prodBD.consultar(id);
    }

    public ArrayList<VendaSingleton> listarTodos() throws SQLException {
        ArrayList<VendaSingleton> Vendas = new ArrayList<>();
        for (Object obj : prodBD.listarTodos()) {
            Vendas.add((VendaSingleton) obj);
        }
        return Vendas;
    }

}
