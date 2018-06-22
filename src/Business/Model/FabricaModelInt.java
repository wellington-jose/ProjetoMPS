package Business.Model;

/**
 *
 * @author wellington
 */
public interface FabricaModelInt {

    Cliente criarCliente(String c, String n, String d, String e, String t, String em, String f);

    Funcionario criarFuncionario(String c, String n, String d, String e, String t, String em,
            float s, String da, String st);

    Gerente criarGerente(String c, String n, String d, String e, String t, String em,
            float s, String da, String st);

    Administrador criarAdministrador(String c, String n, String d, String e, String t, String em,
            float s, String da, String st);

    PessoaFisica criarPessoaFisica(String c, String n, String d, String e, String t, String em);

    PessoaJuridica criarPessoaJuridica(String c, String n, String d, String e, String t, String em);

    Usuario criarUsuario(String c, String l, String s);

    Produto criarProduto(String d, String n, float p);

    VendaSingleton criarVenda(String dt, String forn, float vlr, String func);

    Venda_Produtos criarVenda_Produtos(String idNT, String idP, float vu, int quant);

    VendaIndividual criarVendaIndividual(String p, float vu, int q);
}
