import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {

    protected long imei;
    protected int memoryAmount;

    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, long imei,
            int memoryAmount) {
        super(codice, nome, marca, prezzo, iva);

        this.imei = imei;
        this.memoryAmount = memoryAmount;
    }

    @Override
    public String toString() {
        return "Lo smartphone " + this.nome + " " + "con una memoria di " + this.memoryAmount
                + "GB" + " " + "creato da " + this.marca + ", " + "tuo al modico prezzo di "
                + this.prezzo.setScale(2, RoundingMode.DOWN) + "$";
    }

    public long getImei() {
        return this.imei;
    }

}