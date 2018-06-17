package Infra.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class ConexaoBD {

    private static final String url = "jdbc:mysql://localhost:3306/empresa";
    private static final String usuario = "root";
    private static final String password = "";

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(url, usuario, password);
        } catch (Exception ex) {
            throw new SQLException(ex.getMessage());
        }

    }

}
