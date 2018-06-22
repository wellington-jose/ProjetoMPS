package Infra.BD;

import Business.Model.Usuario;
import Infra.InfraAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class UsuarioBDAdapter extends UsuarioBD implements InfraAdapter {

    UsuarioBD c;

    public UsuarioBDAdapter() {
        c = new UsuarioBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarUsuario((Usuario) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerUsuario(id);
    }

    public boolean atualizaDados(Object obj) throws SQLException {

        return true;
    }

    public Object consultar(String id) throws SQLException {
        return null;
    }

    public ArrayList<Object> listarTodos() throws SQLException {
         ArrayList<Object> ret = new ArrayList<>();
        for (Usuario u : c.listarTodosUsuarios()) {
            ret.add(u);
        }
        return ret;
    }

}
