package Infra.BD;

/**
 *
 * @author wellington
 */
import Business.Model.PessoaFisica;
import java.sql.Connection;
import java.sql.SQLException;

public class PessoaFisicaBD {

    private Connection con;

    public PessoaFisicaBD() {
    }

    public void salvarPessoaFisica(PessoaFisica pj) throws SQLException {
        this.abrirConexao();

        System.out.println("GRAVOU NO BANCO DE DADOS");

        this.fechaConexao();
    }

    public void removerPPessoaFisica(String cpf) throws SQLException {
        this.abrirConexao();

        System.out.println("REMOVEU DO BANDO DE DADOS");

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
