package Infra.BD;

import Business.Model.Cliente;
import Business.Model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class FuncionarioBD {

    TemplateBD template;

    public FuncionarioBD() {
        template = new TemplateBD();
    }

    public void salvarFuncionario(Funcionario c) throws SQLException {
        // capturar todos os dados do funcionario e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getCpf());
        dados.add(c.getNome());
        dados.add(c.getDataNascimento());
        dados.add(c.getEndereco());
        dados.add(c.getTelefone());
        dados.add(c.getEmail());
        dados.add(String.valueOf(c.isCadastro()));
        dados.add(String.valueOf(c.getSalario()));
        dados.add(c.getDataAdmissão());
        dados.add(c.getSetor());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        template.salvar(dados, query);
        System.out.println("GRAVOU FUNCIONARIO NO BANCO DE DADOS Roberto");
    }

    public void removerFuncionario(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU FUNCIONARIO DO BANDO DE DADOS");
    }

    public boolean atualizarFuncionario(Funcionario c) throws SQLException {
        // capturar todos os dados do funcionairo e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getCpf());
        dados.add(c.getNome());
        dados.add(c.getDataNascimento());
        dados.add(c.getEndereco());
        dados.add(c.getTelefone());
        dados.add(c.getEmail());
        dados.add(String.valueOf(c.isCadastro()));
        dados.add(String.valueOf(c.getSalario()));
        dados.add(c.getDataAdmissão());
        dados.add(c.getSetor());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);
        System.out.println("ATUALIZOU DADO DE FUNCIONARIO NO BANCO DE DADOS");
        return true;
    }

    public Funcionario consultarFuncionario(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        ArrayList<String> dados = template.consultar(id, query);
//        Funcionario c = new Funcionario(dados.get(0), dados.get(1), dados.get(2), dados.get(3),
//                dados.get(4), dados.get(5), dados.get(7), dados.get(8), dados.get(9));
//        c.setCadastro(Boolean.parseBoolean(dados.get(6)));
//        return c;
        System.out.println("CONSULTOU FUNCIONARIO DO BANDO DE DADOS");
        return null;
    }

    public ArrayList<Funcionario> listarTodosFuncionarios() throws SQLException {
        ArrayList<Funcionario> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        Cliente aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depos converte em Cliente e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (Funcionario) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODOS FUNCIONÁRIOS DO BANDO DE DADOS");
        return null;
    }
}
