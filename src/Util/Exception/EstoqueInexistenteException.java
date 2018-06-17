package Util.Exception;

/**
 *
 @authors
 * Carlos wellington
 */
public class EstoqueInexistenteException extends Exception {
    private String erro;

    public EstoqueInexistenteException(String erro) {
       super(erro);
    }

    @Override
    public String toString() {
        return erro;

    }

    
}
