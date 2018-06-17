package Business.Control;

import Business.Model.PessoaFisica;
import Util.Exception.CPFInvalidoException;
import java.util.HashMap;

/**
 *
 * @author wellington
 */
public class PessoaFisicaControl {
    
    private final HashMap<String, PessoaFisica> pessoasJuridicas;
    
    public PessoaFisicaControl(){
        pessoasJuridicas = new HashMap<>();
    }
    public void salvarDadosPessoaFisicaDAO(PessoaFisica pessoa) {
    }

    public void salvarDadosPessoaFisicaBD(PessoaFisica pessoa)  {
      
    }

    public void cadastrarPessoaFisica(PessoaFisica pessoa) {
        pessoasJuridicas.put(pessoa.getCpf(), pessoa);
    }

    public void removerPessoaJuridica(String cpf) {
        for (HashMap.Entry<String, PessoaFisica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cpf)) {
                pessoasJuridicas.remove(c);
                break;
            }
        }
    }


    public PessoaFisica listarPessoaFisicaPorCPF(String cpf) {
        for (HashMap.Entry<String, PessoaFisica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cpf)) {
                return c.getValue();
            }
        }
        return null;
    }

    public boolean validarExistenciaCPF(String cpf) throws CPFInvalidoException {
        boolean ret = false;
        for (HashMap.Entry<String, PessoaFisica> c : pessoasJuridicas.entrySet()) {
            if (c.getKey().equals(cpf)) {
                ret = true;
                break;
            }
        }
        if (!ret) {
            throw new CPFInvalidoException("Erro: CNPJ inválido.");
        }
        return false;
    }
}
