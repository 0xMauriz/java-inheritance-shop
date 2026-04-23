import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    protected String color;
    protected boolean isWireless;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String color,
            boolean isWireless) {

        super(codice, nome, marca, prezzo, iva);

        this.color = color;
        this.isWireless = isWireless;

    }

}
