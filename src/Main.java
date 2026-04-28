import java.math.BigDecimal;

public class Main {

        public static void main(String[] args) {

                Televisori SharpHD = new Televisori(001, "Sharp HD", "Sharp", new BigDecimal(220.33),
                                new BigDecimal(0.22),
                                40, true);

                Televisori SamsungUltraHD = new Televisori(002, "Samsung UltraHD", "Samsung", new BigDecimal(330.22),
                                new BigDecimal(0.22),
                                50, false);

                Smartphone SamsungGalaxyS24 = new Smartphone(010, "Samsung galaxy S24", "Samsung",
                                new BigDecimal(930.22), new BigDecimal(0.22), 356789123456789l, 256);

                Smartphone XiaomiXZ20 = new Smartphone(11, "Xiaomi XZ20", "Xiaomi", new BigDecimal(250.40),
                                new BigDecimal(0.22), 856589133454789l, 512);

                Cuffie JBL202BT = new Cuffie(100, "JBL202BT", "JBL", new BigDecimal(30), new BigDecimal(0.22),
                                "white", true);

                Cuffie BeatsByDad = new Cuffie(101, "Beats by dad", "Beats", new BigDecimal(124.99),
                                new BigDecimal(0.22), "Orange", true);

                Cuffie CuffieIpodNano = new Cuffie(101, "Cuffie Ipod Nano", "Apple", new BigDecimal(50.99),
                                new BigDecimal(0.22), "white", false);

                // Smartphones
                System.out.println(SamsungGalaxyS24.getInfo());
                System.out.println(XiaomiXZ20.getInfo());

                // Televisori
                System.out.println(SharpHD.getInfo());
                System.out.println(SamsungUltraHD.getInfo());

                // Cuffie
                System.out.println(JBL202BT.getInfo());
                System.out.println(BeatsByDad.getInfo());
                System.out.println(CuffieIpodNano.getInfo());

        }

}
