package Util.Exception;

/**
 *
 @author wellington
 */
public class BDException extends Exception {
    private String erro;

    public BDException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
