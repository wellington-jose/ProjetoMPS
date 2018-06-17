package Infra.BD;

import Business.Model.PessoaJuridica;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wellington
 */
public class PessoaJuridicaBD {

    private Connection con;

    public PessoaJuridicaBD() {

    }

    public void salvarPessoaJuridica(PessoaJuridica pj) throws SQLException {
        this.abrirConexao();

        System.out.println("GRAVOU PESSOA JURIDICA NO BANCO DE DADOS");

        this.fechaConexao();
    }

    public void removerPessoaJuridica(String cnpg) throws SQLException {
        this.abrirConexao();

        System.out.println("REMOVEU JURIDICA DO BANDO DE DADOS");

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
