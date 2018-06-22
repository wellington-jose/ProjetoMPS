package Util.Exception;

/**
 *
 @author wellington 
 */
public class CNPJInvalidoException extends Exception {
    private String erro;

    public CNPJInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
