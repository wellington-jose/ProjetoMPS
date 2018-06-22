package Business.Control;

import Business.Model.Usuario;
import Util.Exception.NomeInvalidoException;
import Util.Exception.SenhaInvalidaException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author wellington
 */
public class ControlUser {

    HashMap<String, Usuario> mapa;

    public ControlUser() {
        this.lerDados();
    }


    public void salvarDados(Usuario us) {

    }

    public void lerDados() {

    }

    public ArrayList<String> listarUsuario() {
        ArrayList<String> retorno = new ArrayList<>();
        this.lerDados();
        for (HashMap.Entry<String, Usuario> u : mapa.entrySet()) {
            retorno.add(u.getValue().getLogin());
        }
        return retorno;
    }

    public ArrayList<String> listUsuarioPorNome(String login) {
        ArrayList<String> retorno = new ArrayList<>();
        this.lerDados();
        for (HashMap.Entry<String, Usuario> u : mapa.entrySet()) {
            if (u.getValue().getLogin().equals(login)) {
                retorno.add(u.getValue().getLogin());
            }
        }
        return retorno;
    }

    public boolean consultarExistenciaLogin(String login) {
        for (HashMap.Entry<String, Usuario> u : mapa.entrySet()) {
            if (u.getValue().getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public void consultarUsuario(String login, String senha) throws SenhaInvalidaException, NomeInvalidoException {
        boolean userLogin = false;
        boolean userSenha = false;
        for (HashMap.Entry<String, Usuario> u : mapa.entrySet()) {
            if (u.getValue().getLogin().equals(login)) {
                userLogin = true;
                if (userLogin && u.getValue().getSenha().equals(senha)) {
                    userSenha = true;
                }
                break;
            }
        }

        if (!userLogin) {
            throw new NomeInvalidoException("Erro: Login Inválido.");
        }

        if (!userSenha) {
            throw new SenhaInvalidaException("Erro: Senha Inválida.");
        }

    }

}
