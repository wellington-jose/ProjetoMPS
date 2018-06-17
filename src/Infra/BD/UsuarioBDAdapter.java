package Infra.BD;

import Business.Model.Modelos;
import Business.Model.Usuario;
import Infra.InfraAdapter;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class UsuarioBDAdapter extends UsuarioBD implements InfraAdapter {
    UsuarioBD c;
    
    public UsuarioBDAdapter(){
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
}
