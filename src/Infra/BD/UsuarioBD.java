package Infra.BD;

/**
 *
 * @author wellington
 */
import Business.Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBD {

    private Connection con;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;

    public UsuarioBD() {
    }

    public void salvarUsuario(Usuario c) throws SQLException {
        this.abrirConexao();

        String query;
        PreparedStatement stmt;

        // incluindo os dados do cliente
        query = "INSERT INTO login_cliente (cpf_cliente, login_cliente, senha_cliente)"
                + "VALUES(?, ?, ?)";
        stmt = con.prepareStatement(query);

        stmt.setString(1, c.getCpf());
        stmt.setString(2, c.getLogin());
        stmt.setString(3, c.getSenha());
        // Executa o comando de gravar os dados
        stmt.executeUpdate();

        this.fechaConexao();
    }

    public void removerUsuario(String cpf) throws SQLException {
        this.abrirConexao();

        String query;
        PreparedStatement stmt;

        // Deletando o cliente
        query = "DELETE FROM login_cliente WHERE cpf_liente = ?";
        stmt = con.prepareStatement(query);
        stmt.setString(1, cpf);
        stmt.executeUpdate();

        this.fechaConexao();
    }

    public Usuario lerDadoBD(String cpf1) throws SQLException {
        ArrayList<String> dados = new ArrayList<>();

        this.abrirConexao();

        String query;
        PreparedStatement stmt;

        // Capturando os dados de um cliente
        query = "SELECT * FROM cliente WHERE CPFCliente LIKE ?";
        stmt = con.prepareStatement(query);
        stmt.setString(1, cpf1);
        stmt.getResultSet();
        resultSet = stmt.executeQuery();

        metaData = resultSet.getMetaData();
        int quantColuna = metaData.getColumnCount();

        for (int i = 0; i < quantColuna; i++) {
            dados.set(i, resultSet.getString(i));
        }

        // Capturando os dados de um cliente
        query = "SELECT * FROM endereco WHERE cpf LIKE ?";
        stmt = con.prepareStatement(query);
        stmt.setString(1, cpf1);
        stmt.getResultSet();
        resultSet = stmt.executeQuery();

        metaData = resultSet.getMetaData();
        quantColuna = metaData.getColumnCount();

        for (int i = 1; i < quantColuna; i++) {
            dados.set(i, resultSet.getString(i));
        }

        this.fechaConexao();

        return new Usuario(dados.get(1), dados.get(0), dados.get(3));
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
