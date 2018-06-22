package Business.Control;

import Business.Model.PessoaJuridica;
import Util.Exception.CNPJInvalidoException;
import java.util.HashMap;

/**
 *
 * @author wellington
 */
public class ControlDistribuidor {

    private final HashMap<String, PessoaJuridica> pessoasJuridicas;

    public ControlDistribuidor() {
        pessoasJuridicas = new HashMap<>();
    }

    public void salvarDadosPessoaJuridicaDAO(PessoaJuridica pessoa) {
        
    }

    public void salvarDadosPessoaJuridicaBD(PessoaJuridica pessoa)  {

    }

    public void cadastrarPessoaJuridica(PessoaJuridica pessoa) {
        pessoasJuridicas.put(pessoa.getCnpj(), pessoa);
    }

    public void removerPessoaJuridica(String cpf) {
        for (HashMap.Entry<String, PessoaJuridica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cpf)) {
                pessoasJuridicas.remove(c);
                break;
            }
        }
    }


    public PessoaJuridica listarPessoaJuridicaPorCNPJ(String cnpj) {
        for (HashMap.Entry<String, PessoaJuridica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cnpj)) {
                return c.getValue();
            }
        }
        return null;
    }

    public boolean validarExistenciaCNPJ(String cpf) throws CNPJInvalidoException {
        boolean ret = false;
        for (HashMap.Entry<String, PessoaJuridica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cpf)) {
                ret = true;
                break;
            }
        }
        if (!ret) {
            throw new CNPJInvalidoException("Erro: CNPJ inválido.");
        }
        return false;
    }

}
