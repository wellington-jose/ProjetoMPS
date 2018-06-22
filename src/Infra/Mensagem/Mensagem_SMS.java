package Infra.Mensagem;

/**
 *
 * @author wellington
 */
public class Mensagem_SMS extends Mensagem {

    private String destinatario;

    public Mensagem_SMS(Mediator m, String e) {
        super(m);
        this.destinatario = e;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("SMS recebeu a seguinte mensagem:\n" + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviou para " + destinatario +" a seguinte mensagem\n" + mensagem);
    }
}
