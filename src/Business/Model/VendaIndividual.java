package Business.Model;

/**
 *
 * @author wellington
 */
public class VendaIndividual {

    private String prod;
    private float vlrUnit;
    private int quant;
    private float vlrtotal;

    public VendaIndividual(String p, float vu, int q) {
        this.prod = p;
        this.vlrUnit = vu;
        this.quant = q;
        this.vlrtotal = vu * q;
    }

    public VendaIndividual() {

    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public float getVlrUnit() {
        return vlrUnit;
    }

    public void setVlrUnit(float vlrUnit) {
        this.vlrUnit = vlrUnit;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getVlrtotal() {
        return vlrtotal;
    }

    public void setVlrtotal(float vlrtotal) {
        this.vlrtotal = vlrtotal;
    }

    @Override
    public String toString(){
        return prod + " - " + vlrUnit + " - "+ quant + " - " + vlrtotal;
    }
}
