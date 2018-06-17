package Infra.BD;

import Business.Model.PessoaFisica;
import Infra.InfraAdapter;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class PessoaFisicaBDAdapter extends PessoaFisicaBD implements InfraAdapter {

    PessoaFisicaBD c;

    public PessoaFisicaBDAdapter() {
        c = new PessoaFisicaBD();
    }

    @Override
    public void salvarDados(Object obj) throws SQLException {
        c.salvarPessoaFisica((PessoaFisica) obj);
    }

    @Override
    public void removerDados(String id) throws SQLException {
        c.removerPPessoaFisica(id);
    }
}
