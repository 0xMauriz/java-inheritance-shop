import java.math.BigDecimal;

public class Prodotto {

    protected final int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {

        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

    }

}
