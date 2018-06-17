package Util.Exception;

/**
 *
 @authors
 * Carlos wellington
 */
public class DadoInvalidoException extends Exception {
    private String erro;

    public DadoInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;
    }

    
}
