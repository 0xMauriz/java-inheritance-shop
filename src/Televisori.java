import java.math.BigDecimal;

public class Televisori extends Prodotto {

    protected int heigth;
    protected int width;
    protected boolean isSmart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int heigth, int width,
            boolean isSmart) {

        super(codice, nome, marca, prezzo, iva);

        this.heigth = heigth;
        this.width = width;
        this.isSmart = isSmart;

    }

    public String getInfo() {
        return "Il televisore " + this.nome + " prodotto da " + this.marca + " al modico prezzo di " + this.prezzo 
    }

}
