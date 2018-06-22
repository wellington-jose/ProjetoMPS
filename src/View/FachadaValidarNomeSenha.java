package View;

import Util.Exception.NomeInvalidoException;
import Util.Exception.SenhaInvalidaException;
import Util.Validacao.ValidarLogin;
import Util.Validacao.ValidarSenha;

/**
 *
 * @author wellington
 */
public class FachadaValidarNomeSenha {
    protected ValidarLogin vn;
    protected ValidarSenha vs;
    
    public FachadaValidarNomeSenha(){
        vn = new ValidarLogin();
        vs = new ValidarSenha();
    }
    
    public void validarNomeSenha(String nome, String senha) throws NomeInvalidoException, SenhaInvalidaException{
        vn.validarLogin(nome);
        vs.validarSenha(senha);
    }
}
