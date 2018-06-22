package Business.Control;

import Business.Model.Produto;
import Business.Model.Usuario;
import Infra.BD.ProdutoBDAdapter;
import Infra.BD.UsuarioBDAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ControlUsuario {

    UsuarioBDAdapter prodBD;

    public ControlUsuario() {
        prodBD = new UsuarioBDAdapter();
    }

    public void salvarDados(Usuario p) throws SQLException {
        prodBD.salvarDados(p);
    }

    public void removerDados(String id) throws SQLException {
        prodBD.removerDados(id);

    }

    public void atualizarDados(Usuario p) throws SQLException {
        prodBD.atualizaDados(p);

    }

    public Usuario listarUsuario(String id) throws SQLException {
        return (Usuario) prodBD.consultar(id);
    }

    public ArrayList<Usuario> listarTodos() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for (Object obj : prodBD.listarTodos()) {
            usuarios.add((Usuario) obj);
        }
        return usuarios;
    }
   
}
