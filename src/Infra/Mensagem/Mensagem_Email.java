package Infra.Mensagem;

/**
 *
 * @author wellington
 */
public class Mensagem_Email extends Mensagem {

    private String destinatario, remetente;
    
    public Mensagem_Email( Mediator m, String e) {
        super(m);
        this.destinatario = e;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Email recebeu a seguinte mensagem:\n" + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
          System.out.println("email enviou para " + destinatario +" a seguinte mensagem\n" + mensagem);
    }

    
}
