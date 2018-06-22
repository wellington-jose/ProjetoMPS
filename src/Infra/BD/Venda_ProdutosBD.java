package Infra.BD;

import Business.Model.VendaSingleton;
import Business.Model.Venda_Produtos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class Venda_ProdutosBD {

    TemplateBD template;

    public Venda_ProdutosBD() {
        template = new TemplateBD();
    }

    public void salvarVenda_Produtos(Venda_Produtos c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getIdNotaFiscal());
        dados.add(c.getIdProduto());
        dados.add(String.valueOf(c.getValorUnitario()));
        dados.add(String.valueOf(c.getQuantidade()));
        dados.add(String.valueOf(c.getValorTotal()));

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        template.salvar(dados, query);
        System.out.println("GRAVOU VENDA_PRODUTOS NO BANCO DE DADOS");
    }

    public void removerVenda_Produtos(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU VENDA_PRODUTOS DO BANDO DE DADOS");
    }

    public boolean atualizarVenda_Produtos(Venda_Produtos c) throws SQLException {
        // capturar todos os dados do Venda_Produtos e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getIdNotaFiscal());
        dados.add(c.getIdProduto());
        dados.add(String.valueOf(c.getValorUnitario()));
        dados.add(String.valueOf(c.getQuantidade()));
        dados.add(String.valueOf(c.getValorTotal()));

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);
        System.out.println("ATUALIZOU DADO DE VENDA_PRODUTOS NO BANCO DE DADOS");
        return true;
    }

    public VendaSingleton consultarVenda_Produtos(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        ArrayList<String> dados = template.consultar(id, query);
//        Venda_Produtos c = new Venda_Produtos(dados.get(0), dados.get(1), dados.get(2),
//               dados.get(3), dados.get(4), dados.get(5));
//        return c;
        System.out.println("CONSULTOU VENDA DO BANDO DE DADOS");
        return null;
    }

    public ArrayList<Venda_Produtos> listarTodasVendas_Produtos() throws SQLException {
        ArrayList<Venda_Produtos> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        Venda_Produtos aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depos converte em Cliente e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (Venda_Produtos) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODAS VENDA_PRODUTOS DO BANDO DE DADOS");
        return null;
    }

    public int lerIdNotaFiscal() throws SQLException {
        String query = "SELECT * FROM venda";
        String nomeColuna = "id_venda";
//        return template.lerIDUltimoRegistro(query, nomeColuna);
        return 3;
    }
}
