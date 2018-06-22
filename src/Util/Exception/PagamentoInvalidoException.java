package Util.Exception;

/**
 *
 @author wellington
 */
public class PagamentoInvalidoException extends Exception {
    private String erro;

    public PagamentoInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
