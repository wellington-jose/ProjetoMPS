package Infra.BD;

import Business.Model.PessoaJuridica;
import Infra.InfraAdapter;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class PessoaJuridicaBDAdapter extends PessoaJuridicaBD implements InfraAdapter {
    PessoaJuridicaBD c;
    
    public PessoaJuridicaBDAdapter(){
        c = new PessoaJuridicaBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarPessoaJuridica((PessoaJuridica) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerPessoaJuridica(id);
    }
}
