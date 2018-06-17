package Util.Exception;

/**
 *
 @authors
 * Carlos wellington
 */
public class VendaInvalidaException extends Exception {
    private String erro;

    public VendaInvalidaException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
