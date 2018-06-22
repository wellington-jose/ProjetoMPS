package Business.Model;

/**
 *
 * @author wellington
 */
public class Administrador {

    PessoaFisica pf;
    private float salario;
    private String dataAdmissão;
    private String setor;

    public Administrador() {

    }

    public Administrador(String c, String n, String d, String e, String t, String em,
            float s, String da, String st) {
        pf = new PessoaFisica(c, n, d, e, t, em);
        this.salario = s;
        this.dataAdmissão = da;
        this.setor = st;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(String dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString().toString() + ", " + setor;
    }

}
