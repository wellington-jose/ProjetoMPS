package Business.Model;

/**
 *
 * @author wellington
 */
public class Cliente extends PessoaFisica {

    private PessoaFisica pf;
    private String facebook;

    public Cliente() {
    }

    public Cliente(String n, String c, String d, String e, String t, String em, String f) {
        pf = new PessoaFisica(n, c, d, e, t, em);
        this.facebook = f;
    }

    public Cliente(String f) {
        super();
        this.facebook = f;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + facebook;
    }

}
