package Infra.BD;

/**
 *
 * @author wellington
 */
import Business.Model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBD {

    TemplateBD template;
    
    public UsuarioBD() {
        template = new TemplateBD();
    }

    public void salvarUsuario(Usuario c) throws SQLException {
        ArrayList<String> dados = new ArrayList<>();
        dados.add(c.getCpf());
        dados.add(c.getLogin());
        dados.add(c.getSenha());

        // incluindo os dados do cliente
        String query = "INSERT INTO login_cliente (cpf_cliente, login_cliente, senha_cliente)"
                + "VALUES(?, ?, ?)";

        // chamar o método específico da classe TemplateBD;        
//        template.salvar(dados, query);
        System.out.println("GRAVOU USUÁRIO NO BANCO DE DADOS");
    }

    public void removerUsuario(String cpf) throws SQLException {

        // elaborar o comando MySQL específico
        String query = "DELETE FROM login_cliente WHERE cpf_liente = ?";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU USUÁRIO DO BANDO DE DADOS");
    }

    public boolean atualizarUsuario(Usuario c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getCpf());
        dados.add(c.getLogin());
        dados.add(c.getSenha());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);
        System.out.println("ATUALIZOU DADO DE USUÁRIO NO BANCO DE DADOS");
        return true;
    }

    public Usuario lerDadoBD(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "SELECT * FROM cliente WHERE CPFCliente LIKE ?";

        // chamar o método específico da classe TemplateBD; 
        ArrayList<String> dados = template.consultar(id, query);
        Usuario us = new Usuario(dados.get(0), dados.get(1), dados.get(2));
//        return us;

        System.out.println("CONSULTOU USUÁRIO DO BANDO DE DADOS");
        return null;

    }

    public ArrayList<Usuario> listarTodosUsuarios() throws SQLException {
        ArrayList<Usuario> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        Usuario aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depois converte em Usuário e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (Usuario) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODOS USUÁRIOS DO BANDO DE DADOS");
        return null;
    }
}
