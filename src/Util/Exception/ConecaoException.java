package Util.Exception;

/**
 *
 @author wellington 
 */
public class ConecaoException extends Exception {
    private String erro;

    public ConecaoException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;
    }

    
}
