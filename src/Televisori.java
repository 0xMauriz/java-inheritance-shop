import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisori extends Prodotto {

    protected int pollici;
    protected boolean isSmart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici,
            boolean isSmart) {

        super(codice, nome, marca, prezzo, iva);

        this.pollici = pollici;
        ;
        this.isSmart = isSmart;

    }

    @Override
    public String toString() {

        if (isSmart == true) {

            return "Il televisore " + "SmartTV " + this.nome + " prodotto da " + this.marca
                    + ", tuo al modico prezzo di "
                    + this.prezzo.setScale(2, RoundingMode.DOWN) + "$" + " con dimensioni " + this.pollici + "''";

        }

        return "Il televisore " + this.nome + " prodotto da " + this.marca + ", tuo al modico prezzo di "
                + this.prezzo.setScale(2, RoundingMode.DOWN) + "$" + " con dimensioni " + this.pollici + "''";

    }

}
