package Util.Exception;

/**
 *
 @author wellington
 */
public class TelefoneInvalidoException extends Exception {
    private String erro;

    public TelefoneInvalidoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;
    }

    
}
