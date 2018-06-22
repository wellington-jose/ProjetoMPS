package Infra.Mensagem;

import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class MensagemMediator implements Mediator {

    protected ArrayList<Mensagem> contatos;

    public MensagemMediator() {
        contatos = new ArrayList<Mensagem>();
    }

    public void adicionarMensagem(Mensagem mens) {
        contatos.add(mens);
    }

    @Override
    public void enviar(String mensagem, Mensagem mens) {
        for (Mensagem mensag : contatos) {
            if (mensag != mens) {
//                definirProtocolo(mensag);
//                mensag.receberMensagem(mensagem);
            }
        }
    }

    private void definirProtocolo(Mensagem mens) {
        if (mens instanceof Mensagem_Email) {
            System.out.println("Protocolo iOS");
        } else if (mens instanceof Mensagem_SMS) {
            System.out.println("Protocolo Android");
        } else if (mens instanceof Mensagem_WhatsApp) {
            System.out.println("Protocolo Symbian");
        }
    }

    @Override
    public void receber(String mensagem, Mensagem mens) {

    }

}
