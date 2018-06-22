package Business.Control;

/**
 *
 * @author wellington
 */
public interface FabricaControlInt {

    ControlCliente criarControlCliente();

    ControlDistribuidor criarControlDistribuidor();

    ControlEnviarMensagem criarControlEnviarMensagem();

    ControlFuncionario criarControlFuncionario();

    ControlGerente criarControlGerente();

    ControlPagamento criarControlPagamento();

    ControlPessoaFisica criarControlPessoaFisica();

    ControlProduto criarControlProduto();

    ControlUser criarControlUser();

    ControlUsuario criarControlUsuario();

    ControlVenda criarControlVenda();

    ControlVenda_Produtos criarControlVenda_Produtos();

}
