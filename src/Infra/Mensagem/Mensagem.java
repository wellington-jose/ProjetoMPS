package Infra.Mensagem;

/**
 *
 * @author wellington
 */
public abstract class Mensagem {

    protected Mediator mediator;

    public Mensagem(Mediator m) {
        this.mediator = m;
    }

    public abstract void enviarMensagem(String mensagem);

    public abstract void receberMensagem(String mensagem);
}
