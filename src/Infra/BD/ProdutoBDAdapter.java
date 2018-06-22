package Infra.BD;

import Business.Model.Produto;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ProdutoBDAdapter implements InfraAdapter {

    ProdutoBD c;

    public ProdutoBDAdapter() {
        c = new ProdutoBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarProduto((Produto) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerProduto(id);
    }

    public boolean atualizaDados(Object obj) throws SQLException {
        return c.atualizarProduto((Produto) obj);
    }

    public Object consultar(String id) throws SQLException {
        return c.consultarProduto(id);
    }

    public ArrayList<Object> listarTodos() throws SQLException {
        ArrayList<Object> ret = new ArrayList<>();
        for (Produto p : c.listarTodosProdutos()) {
            ret.add(p);
        }
        return ret;
    }

}
