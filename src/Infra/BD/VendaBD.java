package Infra.BD;

import Business.Model.VendaSingleton;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class VendaBD {

    TemplateBD template;

    public VendaBD() {
        template = new TemplateBD();
    }

    public void salvarVenda(VendaSingleton c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getData());
        dados.add(c.getIdCliente());
        dados.add(String.valueOf(c.getValor()));
        dados.add(c.getIdFuncionario());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        template.salvar(dados, query);
        System.out.println("GRAVOU VENDA NO BANCO DE DADOS");
    }

    public void removerVenda(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        template.remover(id, query);
        System.out.println("REMOVEU VENDA DO BANDO DE DADOS");
    }

    public boolean atualizarVenda(VendaSingleton c) throws SQLException {
        // capturar todos os dados do cliente e add na lista dados
        ArrayList<String> dados = new ArrayList<>();

        dados.add(c.getData());
        dados.add(c.getIdCliente());
        dados.add(String.valueOf(c.getValor()));
        dados.add(c.getIdFuncionario());

        // elaborar o comando MySQL específico
        String query = "Comando MySQL especifico";

        // chamar o método específico da classe TemplateBD;        
//        return template.atualizar(dados, query);
        System.out.println("ATUALIZOU DADO DE VENDA NO BANCO DE DADOS");
        return true;
    }

    public VendaSingleton consultarVenda(String id) throws SQLException {
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        // chamar o método específico da classe TemplateBD; 
//        ArrayList<String> dados = template.consultar(id, query);
//        VendaSingleton c = new Cliente(dados.get(0), dados.get(1), dados.get(2), dados.get(3),
//                dados.get(4));
//        return c;
        System.out.println("CONSULTOU VENDA DO BANDO DE DADOS");
        return null;
    }

    public ArrayList<VendaSingleton> listarTodasVendas() throws SQLException {
        ArrayList<VendaSingleton> c = new ArrayList<>();
        // elaborar o comando MySQL específico
        String query = "Comando MySQL específico";

        VendaSingleton aux;
        // chamar o método específico da classe TemplateBD, que retorna uma Lista
        // de Objetct, depos converte em Cliente e adiciona na nova Lista de retorno
//        for (Object obj : template.lerTodos(query)) {
//            aux = (VendaSingleton) obj;
//            c.add(aux);
//        }
//        return c;

        System.out.println("LISTOU TODOS VENDA DO BANDO DE DADOS");
        return null;
    }
}
