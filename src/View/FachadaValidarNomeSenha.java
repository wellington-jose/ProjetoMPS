package View;

import Util.Exception.NomeInvalidoException;
import Util.Exception.SenhaInvalidaException;
import Util.Validacao.ValidarNome;
import Util.Validacao.ValidarSenha;

/**
 *
 * @author wellington
 */
public class FachadaValidarNomeSenha {
    protected ValidarNome vn;
    protected ValidarSenha vs;
    
    public FachadaValidarNomeSenha(){
        vn = new ValidarNome();
        vs = new ValidarSenha();
    }
    
    public void validarNomeSenha(String nome, String senha) throws NomeInvalidoException, SenhaInvalidaException{
        vn.validarNome(nome);
        vs.validarSenha(senha);
    }
}
