package Infra.BD;

import Business.Model.Cliente;
import Business.Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class ProdutoBD {

    TemplateBD template;

    public ProdutoBD() {
        template = new TemplateBD();
    }

    public void salvarProduto(Produto c) throws SQLException {
        // capturar todos os dados do produto e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getDescricao());
        dados.add(c.getNome());
        dados.add(String.valueOf(c.getPreco()));

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        template.salvar(dados, query);
        System.out.println("GRAVOU PRODUTO NO BANCO DE DADOS");

    }

    public void removerProduto(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU PRODUTO DO BANDO DE DADOS");
    }

    public boolean atualizarProduto(Produto c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getId());
        dados.add(c.getDescricao());
        dados.add(c.getNome());
        dados.add(String.valueOf(c.getPreco()));

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);
        System.out.println("ATUALIZOU DADO DE PRODUTO NO BANCO DE DADOS");
        return true;
    }

    public Produto consultarProduto(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        ArrayList<String> dados = template.consultar(id, query);
//        Produto c = new Produto(dados.get(0), dados.get(1), dados.get(2), , dados.get(3));
//        
//        return c;
        System.out.println("CONSULTOU CLIENTE DO BANDO DE DADOS");
        return null;
    }

    public ArrayList<Produto> listarTodosProdutos() throws SQLException {
        ArrayList<Produto> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        Produto aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depos converte em Produto e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (Produto) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODOS CLIENTE DO BANDO DE DADOS");
        return null;
    }
}
