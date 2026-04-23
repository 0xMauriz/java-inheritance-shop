import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Televisori SharpHD = new Televisori(001, "TV Sharp HD", "Sharp", new BigDecimal(220.33), new BigDecimal(0.22),
                39, 70, true);
        Smartphone samsungGalaxyS24 = new Smartphone(002, "Samsung galaxy S24", "Samsung", new BigDecimal(930.22),
                new BigDecimal(0.22), 356789123456789l, 256);
        Cuffie JBL202BT = new Cuffie(003, "JBL202BT", "JBL", new BigDecimal(30), new BigDecimal(0.22),
                "white", true);

        System.out.println(samsungGalaxyS24.getInfo());

    }

}
