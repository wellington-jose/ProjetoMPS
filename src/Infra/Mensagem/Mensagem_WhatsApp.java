package Infra.Mensagem;

/**
 *
 * @author wellington
 */
public class Mensagem_WhatsApp extends Mensagem {

    private String destinatario;

    public Mensagem_WhatsApp(Mediator m, String e) {
        super(m);
        this.destinatario = e;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("WhatsApp recebeu a seguinte mensagem:\n" + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("WhatsApp enviou para " + destinatario +" a seguinte mensagem\n" + mensagem);
    }
}
