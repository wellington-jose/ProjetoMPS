package Infra.BD;

import Business.Model.Cliente;
import Infra.InfraAdapter;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class ClienteBDAdapter extends ClienteBD implements InfraAdapter {
    ClienteBD c;
    
    public ClienteBDAdapter(){
        c = new ClienteBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarCliente((Cliente) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerCliente(id);
    }
}
