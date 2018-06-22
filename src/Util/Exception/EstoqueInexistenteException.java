package Util.Exception;

/**
 *
 @author wellington
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
