package Util.Validacao;

import Util.Exception.SenhaInvalidaException;

/**
 *
 * @author wellington
 */
public class ValidarSenha {

    public ValidarSenha() {

    }

    // máximo 20 caracteres
    // mínimo de 8 caracteres
    // deve possuir letras e números e ao menos 2 números
    public void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() > 20) {
            throw new SenhaInvalidaException("Erro: senha não pode conter mais de 20 caracteres.");
        }

        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Erro: senha não pode conter menos de 8 caractres.");
        }

        if (this.contNumber(senha) < 2) {
            throw new SenhaInvalidaException("Erro: senha deve possuir dois números.");
        }
    }

    private int contNumber(String senha) {
        char let;
        int cont = 0;
        for (int i = 0; i < senha.length(); i++) {
            let = senha.charAt(i);
            if (Character.isDigit(let)) {
                cont++;
            }
        }
        return cont;
    }
}
