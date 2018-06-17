package Business.Model;

/**
 *
 * @author wellington
 */
public interface FabricaModelInt {

    Cliente criarCliente(String n, String c, String d, String e, String t, String em, String f);

    Funcionario criarFuncionario(String n, String c, String d, String e, String t, String em,
            float s, String da, String st);

    Gerente criarGerente(String n, String c, String d, String e, String t, String em,
            float s, String da, String st);

    PessoaFisica criarPessoaFisica(String n, String c, String d, String e, String t, String em);

    PessoaJuridica criarPessoaJuridica(String n, String c, String d, String e, String t, String em);

    Usuario criarUsuario(String c, String l, String s);
}
