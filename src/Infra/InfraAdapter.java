package Infra;

import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public interface InfraAdapter {

    void salvarDados(Object obj) throws SQLException;

    void removerDados(String id) throws SQLException;
}
