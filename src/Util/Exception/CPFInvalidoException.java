package Util.Exception;

/**
 *
 @author wellington
 */
public class CPFInvalidoException extends Exception {
    private String erro;

    public CPFInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
