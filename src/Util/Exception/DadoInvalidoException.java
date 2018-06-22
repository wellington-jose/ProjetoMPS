package Util.Exception;

/**
 *
 @author wellington
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
