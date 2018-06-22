package Util.Exception;

/**
 *
 @author wellington
 */
public class SenhaInvalidaException extends Exception {
    private String erro;

    public SenhaInvalidaException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
