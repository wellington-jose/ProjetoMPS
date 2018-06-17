package Business.Model;

/**
 *
 * @author wellington
 */
public class Modelos implements FabricaModelInt {

    @Override
    public Cliente criarCliente(String n, String c, String d, String e, String t, String em, String f) {
        return new Cliente();
    }

    @Override
    public Funcionario criarFuncionario(String n, String c, String d, String e, String t, String em,
            float s, String da, String st) {
        return new Funcionario();
    }

    @Override
    public Gerente criarGerente(String n, String c, String d, String e, String t, String em,
            float s, String da, String st) {
        return new Gerente();
    }

    @Override
    public PessoaFisica criarPessoaFisica(String n, String c, String d, String e, String t, String em) {
        return new PessoaFisica(n, c, d, e, t, em);
    }

    @Override
    public PessoaJuridica criarPessoaJuridica(String n, String c, String d, String e, String t, String em) {
        return new PessoaJuridica(n, c, d, e, t, em);
    }

    @Override
    public Usuario criarUsuario(String c, String l, String s) {
        return new Usuario(c, l, s);
    }
}
