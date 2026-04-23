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

    public String getInfo() {
        return this.nome + " " + "creato da " + this.marca + " " + "al modico prezzo di "
                + this.prezzo.setScale(2, RoundingMode.DOWN) + "$" + " " + "con una memoria di " + this.memoryAmount
                + "GB";
    }

    public long getImei() {
        return this.imei;
    }

}