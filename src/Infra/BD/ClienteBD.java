package Infra.BD;

import Business.Model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class ClienteBD {

    private Connection con;

    public ClienteBD() {

    }

    public void salvarCliente(Cliente c) throws SQLException {
        this.abrirConexao();

        System.out.println("GRAVOU CLIENTE NO BANCO DE DADOS");

        this.fechaConexao();
    }

    public void removerCliente(String cpf) throws SQLException {
        this.abrirConexao();

        System.out.println("REMOVEU CLIENTE DO BANDO DE DADOS");

        this.fechaConexao();
    }

    private void abrirConexao() {
        try {
            //Cria uma conexão com o banco de dados
            con = ConexaoBD.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fechaConexao() {
        try {
            // fecha uma conexão com o banco de dados
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
