import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto {

    protected String color;
    protected boolean isWireless;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String color,
            boolean isWireless) {

        super(codice, nome, marca, prezzo, iva);

        this.color = color;
        this.isWireless = isWireless;

    }

    public String getInfo() {
        if (isWireless == true) {
            return "Le nuove cuffie " + this.nome + " Wireless " + this.color + " prodotte da " + this.marca
                    + ", tuo al modico prezzo di " +
                    this.prezzo.setScale(2, RoundingMode.DOWN);
        }

        return "Le nuove cuffie " + this.nome + " " + this.color + " prodotto da " + this.marca
                + ", tuo al modico prezzo di " + this.prezzo.setScale(2, RoundingMode.DOWN);
    }

}
