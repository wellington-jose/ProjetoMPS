package Business.Control;

import Business.Model.Funcionario;
import Infra.BD.FuncionarioBDAdapter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ControlFuncionario {

    FuncionarioBDAdapter prodBD;

    public ControlFuncionario() {
        prodBD = new FuncionarioBDAdapter();
    }

    public void salvarDados(Funcionario p) throws SQLException {
        prodBD.salvarDados(p);
    }

    public void removerDados(String id) throws SQLException {
        prodBD.removerDados(id);

    }

    public void atualizarDados(Funcionario p) throws SQLException {
        prodBD.atualizaDados(p);

    }

    public Funcionario listarUsuario(String id) throws SQLException {
        return (Funcionario) prodBD.consultar(id);
    }

    public ArrayList<Funcionario> listarTodos() throws SQLException {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for (Object obj : prodBD.listarTodos()) {
            funcionarios.add((Funcionario) obj);
        }
        return null;
    }

}
