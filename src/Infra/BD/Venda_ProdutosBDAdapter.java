package Infra.BD;

import Business.Model.Venda_Produtos;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class Venda_ProdutosBDAdapter implements InfraAdapter {

    Venda_ProdutosBD c;

    public Venda_ProdutosBDAdapter() {
        c = new Venda_ProdutosBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarVenda_Produtos((Venda_Produtos) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerVenda_Produtos(id);
    }

    public boolean atualizaDados(Object obj) throws SQLException {
        return c.atualizarVenda_Produtos((Venda_Produtos) obj);
    }

    public Object consultar(String id) throws SQLException {
        return c.consultarVenda_Produtos(id);
    }

    public ArrayList<Object> listarTodos() throws SQLException {
        ArrayList<Object> ret = new ArrayList<>();
        for (Venda_Produtos v : c.listarTodasVendas_Produtos()) {
            ret.add(v);
        }
        return ret;
    }
    
    public int lerUltimoRegistro() throws SQLException{
        return c.lerIdNotaFiscal();
    }

}
