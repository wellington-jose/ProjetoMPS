package Infra.BD;

/**
 *
 * @author wellington
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class TemplateBD {

    private Connection con;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;

    public TemplateBD() {
    }

    public void salvar(ArrayList<String> dados, String query) throws SQLException {
        this.abrirConexao();

        PreparedStatement stmt;
        stmt = con.prepareStatement(query);

        for (int i = 0; i < dados.size(); i++) {
            stmt.setString((i + 1), dados.get(i));
        }

        // Executa o comando de gravar os dados
        stmt.executeUpdate();

        this.fechaConexao();
    }

    public void remover(String cpf, String query) throws SQLException {
        this.abrirConexao();

        PreparedStatement stmt;

        // Deletando o cliente
        stmt = con.prepareStatement(query);
        stmt.setString(1, cpf);
        stmt.executeUpdate();

        this.fechaConexao();
    }

    public boolean atualizar(ArrayList<String> dados, String query) throws SQLException {
        this.abrirConexao();

        PreparedStatement stmt;
        stmt = con.prepareStatement(query);

        for (int i = 0; i < dados.size(); i++) {
            stmt.setString((i + 1), dados.get(i));
        }

        // Executa o comando de gravar os dados atualizados
        stmt.executeUpdate();

        this.fechaConexao();

        return true;
    }

    public ArrayList<String> consultar(String cpf, String query) throws SQLException {
        ArrayList<String> dados = new ArrayList<>();

        this.abrirConexao();
        PreparedStatement stmt;

        // Capturando os dados de um cliente
        stmt = con.prepareStatement(query);
        stmt.setString(1, cpf);
        stmt.getResultSet();
        resultSet = stmt.executeQuery();

        metaData = resultSet.getMetaData();
        int quantColuna = metaData.getColumnCount();

        for (int i = 0; i < quantColuna; i++) {
            dados.set(i, resultSet.getString(i));
        }

        this.fechaConexao();

        return dados;
    }

    public ArrayList<Object> lerTodos(String query) throws SQLException {
        ArrayList<String> dados = new ArrayList<>();
        ArrayList<Object> obj = new ArrayList<>();
        this.abrirConexao();

        PreparedStatement stmt;

        // Capturando os dados de um cliente
        stmt = con.prepareStatement(query);
        stmt.getResultSet();
        resultSet = stmt.executeQuery();

        metaData = resultSet.getMetaData();
        int quantColuna = metaData.getColumnCount();

        // faz um loop lendo todas as linhas da tabela do banco de dados, a primeira a última
        while (resultSet.next()) {
            // pega o resultado de cada coluna da tabela na lista de dados
            for (int i = 0; i < quantColuna; i++) {
                dados.set(1, resultSet.getString(i));
            }
            obj.add(dados);
        }

        this.fechaConexao();

        return obj;
    }

    public int lerIDUltimoRegistro(String query, String nomeColuna) throws SQLException {
        int quantLinha;
        this.abrirConexao();
        PreparedStatement stmt;

        // Capturando o último número da nota fiscal
        stmt = con.prepareStatement(query);
        stmt.getResultSet();
        resultSet = stmt.executeQuery();

        resultSet.last();
        String aux = resultSet.getString(nomeColuna);
        quantLinha = Integer.parseInt(aux) + 1;

        this.fechaConexao();

        return quantLinha;
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
