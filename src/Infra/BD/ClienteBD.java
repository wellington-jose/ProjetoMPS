package Infra.BD;

import Business.Model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ClienteBD {

    TemplateBD template;

    public ClienteBD() {
        template = new TemplateBD();
    }

    public void salvarCliente(Cliente c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getCpf());
        dados.add(c.getNome());
        dados.add(c.getDataNascimento());
        dados.add(c.getEndereco());
        dados.add(c.getTelefone());
        dados.add(c.getEmail());
        dados.add(String.valueOf(c.isCadastro()));
        dados.add(c.getFacebook());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
        template.salvar(dados, query);
        System.out.println("GRAVOU CLIENTE NO BANCO DE DADOS");
    }

    public void removerCliente(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU CLIENTE DO BANDO DE DADOS");
    }

    public boolean atualizarCliente(Cliente c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getCpf());
        dados.add(c.getNome());
        dados.add(c.getDataNascimento());
        dados.add(c.getEndereco());
        dados.add(c.getTelefone());
        dados.add(c.getEmail());
        dados.add(String.valueOf(c.isCadastro()));
        dados.add(c.getFacebook());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);

        System.out.println("ATUALIZOU DADO DE CLIENTE NO BANCO DE DADOS");
        return true;
    }

    public Cliente consultarCliente(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        ArrayList<String> dados = template.consultar(id, query);
//        Cliente c = new Cliente(dados.get(0), dados.get(1), dados.get(2), dados.get(3),
//                dados.get(4), dados.get(5), dados.get(7));
//        c.setCadastro(Boolean.parseBoolean(dados.get(6)));
//        return c;

        System.out.println("CONSULTOU CLIENTE DO BANDO DE DADOS");
        return null;
    }

    public ArrayList<Cliente> listarTodosClientes() throws SQLException {
        ArrayList<Cliente> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        Cliente aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depos converte em Cliente e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (Cliente) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODOS CLIENTE DO BANDO DE DADOS");
        return null;
    }
}
