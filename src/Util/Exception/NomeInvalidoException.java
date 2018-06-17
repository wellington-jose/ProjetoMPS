package Util.Exception;

/**
 *
 @authors
 * Carlos wellington
 */
public class NomeInvalidoException extends Exception {
    private String erro;

    public NomeInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
