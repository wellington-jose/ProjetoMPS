package Business.Control;

import Business.Model.Cliente;
import Business.Model.PessoaFisica;
import Util.Exception.CPFInvalidoException;
import java.util.HashMap;

/**
 *
 * @author wellington
 */
public class ControlCliente {

    private final HashMap<String, Cliente> clientes;

    public ControlCliente() {
        clientes = new HashMap<>();
        clientes.put("222", new Cliente("", "", "", "", "", "", ""));
    }

    public void salvarDadosPessoaFisicaDAO(PessoaFisica pessoa) {
    }

    public void salvarDadosPessoaFisicaBD(PessoaFisica pessoa) {

    }

    public void cadastrarPessoaFisica(Cliente pessoa) {
        clientes.put(pessoa.getCpf(), pessoa);
    }

    public void removerPessoaJuridica(String cpf) {
        for (HashMap.Entry<String, Cliente> c : clientes.entrySet()) {
            if (c.getKey().equals(cpf)) {
                clientes.remove(c);
                break;
            }
        }
    }

    public Cliente listarPessoaFisicaPorCPF(String cpf) {
        for (HashMap.Entry<String, Cliente> c : clientes.entrySet()) {
            if (c.getKey().equals(cpf)) {
                return c.getValue();
            }
        }
        return null;
    }

    public boolean validarExistenciaCPF(String cpf) throws CPFInvalidoException {
        boolean ret = false;

        for (HashMap.Entry<String, Cliente> c : clientes.entrySet()) {
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
