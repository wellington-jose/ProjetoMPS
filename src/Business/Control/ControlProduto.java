package Business.Control;

import Business.Model.Produto;
import Infra.BD.ProdutoBDAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ControlProduto {

    ProdutoBDAdapter prodBD;

    public ControlProduto() {
        prodBD = new ProdutoBDAdapter();
    }

    public void salvarDados(Produto p) throws SQLException {
        prodBD.salvarDados(p);
    }

    public void removerDados(String id) throws SQLException {
        prodBD.removerDados(id);

    }

    public void atualizarDados(Produto p) throws SQLException {
        prodBD.atualizaDados(p);

    }

    public Produto listarUsuario(String id) throws SQLException {
        return (Produto) prodBD.consultar(id);
    }

    public ArrayList<Produto> listarTodos() throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Object obj : prodBD.listarTodos()) {
            produtos.add((Produto) obj);
        }
        return null;
    }

}
