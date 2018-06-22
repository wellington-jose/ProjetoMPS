package Util.Validacao;

import Util.Exception.NomeInvalidoException;

/**
 *
 * @author wellington
 */
public class ValidarLogin {

    public ValidarLogin() {

    }

    // máximo 12 caracteres
    // não pode ser vazio
    // não pode ter números // strWithNumber.matches(“.*\\d.*”)
    public void validarLogin(String login) throws NomeInvalidoException {

        if (login.length() > 12) {
            throw new NomeInvalidoException("Erro: login não pode conter mais de 12 caracteres.");
        }

        if (login.length() == 0) {
            throw new NomeInvalidoException("Erro: login não pode ser vazia.");
        }

        if (login.matches(".*\\d+")) {
            throw new NomeInvalidoException("Erro: login não pode conter números.");
        }
    }
}
