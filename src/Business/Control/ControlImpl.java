package Business.Control;

/**
 *
 * @author wellington
 */
public class ControlImpl implements FabricaControlInt {

    @Override
    public ControlCliente criarControlCliente() {
        return new ControlCliente();
    }

    @Override
    public ControlDistribuidor criarControlDistribuidor() {
        return new ControlDistribuidor();
    }

    @Override
    public ControlEnviarMensagem criarControlEnviarMensagem() {
        return new ControlEnviarMensagem();
    }

    @Override
    public ControlFuncionario criarControlFuncionario() {
        return new ControlFuncionario();
    }

    @Override
    public ControlGerente criarControlGerente() {
        return new ControlGerente();
    }

    @Override
    public ControlPagamento criarControlPagamento() {
        return new ControlPagamento();
    }

    @Override
    public ControlPessoaFisica criarControlPessoaFisica() {
        return new ControlPessoaFisica();
    }

    @Override
    public ControlProduto criarControlProduto() {
        return new ControlProduto();
    }

    @Override
    public ControlUser criarControlUser() {
        return new ControlUser();
    }

    @Override
    public ControlUsuario criarControlUsuario() {
        return new ControlUsuario();
    }

    @Override
    public ControlVenda criarControlVenda() {
        return new ControlVenda();
    }

    @Override
    public ControlVenda_Produtos criarControlVenda_Produtos() {
        return new ControlVenda_Produtos();
    }

}
