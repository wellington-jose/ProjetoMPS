/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Control.ControlEnviarMensagem;

/**
 *
 * @author wellinton
 */
public class TesteMensagens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlEnviarMensagem control = new ControlEnviarMensagem();
        String mensagem = "Produto A em oferta por R$ 50,00";

        control.enviarMensagemEmail(mensagem, "roberto@gmail.com");
        System.out.println("======================");
        control.enviarMensagemSMS(mensagem, "998760987");
        System.out.println("======================");
        control.enviarMensagemWhatsApp(mensagem, "9874569");
    }

}
