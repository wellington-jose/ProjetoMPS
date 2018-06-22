package Business.Control;

import Infra.Mensagem.Mensagem_Email;
import Infra.Mensagem.Mensagem_SMS;
import Infra.Mensagem.Mensagem_WhatsApp;
import Infra.Mensagem.MensagemMediator;

/**
 *
 * @author wellington
 */
public class ControlEnviarMensagem {

    MensagemMediator mediador;
    Mensagem_Email email;
    Mensagem_SMS sms;
    Mensagem_WhatsApp whatsapp;

    public ControlEnviarMensagem() {
        mediador = new MensagemMediator();
    }

    public void enviarMensagemEmail(String mensagem, String e_mail) {
        this.email = new Mensagem_Email(mediador, e_mail);
        mediador.adicionarMensagem(email);
        email.enviarMensagem(mensagem);
    }

    public void enviarMensagemSMS(String mensagem, String numero) {
        sms = new Mensagem_SMS(mediador, numero);
        mediador.adicionarMensagem(sms);
        sms.enviarMensagem(mensagem);
    }

    public void enviarMensagemWhatsApp(String mensagem, String numero) {
        whatsapp = new Mensagem_WhatsApp(mediador, numero);
        mediador.adicionarMensagem(whatsapp);
        whatsapp.enviarMensagem(mensagem);
    }
}
