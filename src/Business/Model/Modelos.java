package Business.Model;

/**
 *
 * @author wellington
 */
public class Modelos implements FabricaModelInt {

    @Override
    public Cliente criarCliente(String c, String n, String d, String e, String t, String em, String f) {
        return new Cliente(c, n, d, e, t, em, f);
    }

    @Override
    public Funcionario criarFuncionario(String c, String n, String d, String e, String t, String em,
            float s, String da, String st) {
        return new Funcionario(c, n, d, e, t, em, s, da, st);
    }

    @Override
    public Gerente criarGerente(String c, String n, String d, String e, String t, String em,
            float s, String da, String st) {
        return new Gerente(c, n, d, e, t, em, s, da, st);
    }

    @Override
    public Administrador criarAdministrador(String c, String n, String d, String e, String t, String em,
            float s, String da, String st) {
        return new Administrador(c, n, d, e, t, em, s, da, st);
    }

    @Override
    public PessoaFisica criarPessoaFisica(String c, String n, String d, String e, String t, String em) {
        return new PessoaFisica(c, n, d, e, t, em);
    }

    @Override
    public PessoaJuridica criarPessoaJuridica(String c, String n, String d, String e, String t, String em) {
        return new PessoaJuridica(c, n, d, e, t, em);
    }

    @Override
    public Usuario criarUsuario(String c, String l, String s) {
        return new Usuario(c, l, s);
    }

    @Override
    public Produto criarProduto(String d, String n, float p) {
        return new Produto(d, n, p);
    }

    @Override
    public VendaSingleton criarVenda(String dt, String forn, float vlr, String func) {
        return new VendaSingleton(dt, forn, vlr, func);
    }

    @Override
    public Venda_Produtos criarVenda_Produtos(String idNT, String idP, float vu, int quant) {
        return new Venda_Produtos(idNT, idP, vu, quant);
    }

    @Override
    public VendaIndividual criarVendaIndividual(String p, float vu, int q) {
        return new VendaIndividual(p, vu, q);
    }
}
