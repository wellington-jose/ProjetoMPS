package Business.Control;

import Business.Model.VendaSingleton;
import Business.Model.Venda_Produtos;
import Infra.BD.Venda_ProdutosBDAdapter;
import Infra.BD.VendasBDAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ControlVenda_Produtos {

    Venda_ProdutosBDAdapter prodBD;

    public ControlVenda_Produtos() {
        prodBD = new Venda_ProdutosBDAdapter();
    }

    public void salvarDados(Venda_Produtos p) throws SQLException {
        prodBD.salvarDados(p);
    }

    public void removerDados(String id) throws SQLException {
        prodBD.removerDados(id);

    }

    public void atualizarDados(Venda_Produtos p) throws SQLException {
        prodBD.atualizaDados(p);

    }

    public Venda_Produtos listarUsuario(String id) throws SQLException {
        return (Venda_Produtos) prodBD.consultar(id);
    }

    public ArrayList<Venda_Produtos> listarTodos() throws SQLException {
        ArrayList<Venda_Produtos> vendas = new ArrayList<>();
        for (Object obj : prodBD.listarTodos()) {
            vendas.add((Venda_Produtos) obj);
        }
        return vendas;
    }

    public int listarUltimoRegistro() throws SQLException {
        return prodBD.lerUltimoRegistro();
    }

}
