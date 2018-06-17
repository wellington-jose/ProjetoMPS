package Util.Exception;

/**
 *
 @authors
 * Carlos wellington
 */
public class InfraException extends Exception {
    private String erro;

    public InfraException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;
    }

    
}
