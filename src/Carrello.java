import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Inserisci quanti prodotti vuoi comprare: ");
        int x = Integer.parseInt(input.nextLine());

        Prodotto[] products = new Prodotto[x];

        for (int i = 0; i < products.length; i++) {

            System.out.println("Inserisci codice prodotto: ");
            int productCode = Integer.parseInt(input.nextLine());

            System.out.println("Inserisci il nome del prodotto: ");
            String productName = input.nextLine();

            System.out.println("Inserisci marca del prodotto: ");
            String productBrand = input.nextLine();

            System.out.println("Inserisci prezzo del prodotto (senza iva): ");
            int productPrice = Integer.parseInt(input.nextLine());

            System.out.println("A quale categoria appartiene il prodotto (Cuffia, Smartphone, Televisore): ");
            String productCategoryString = input.nextLine();

            if (productCategoryString.toLowerCase().equals("cuffia")) {

                System.out.println("Inserisci il colore del prodotto: ");
                String productColor = input.nextLine();

                System.out.println("Inserisci se il prodotto è wireless o no (true se wireless, false se non lo e'): ");
                boolean isWireless = Boolean.parseBoolean(input.nextLine());

                Prodotto cuffia = new Cuffie(productCode, productName, productBrand, new BigDecimal(productPrice),
                        new BigDecimal(0.22), productColor, isWireless);

                products[i] = cuffia;

            }

            else if (productCategoryString.toLowerCase().equals("smartphone")) {

                System.out.println("Inserisci IMEI dello smartphone: ");
                long smartphoneImei = Long.parseLong(input.nextLine());

                System.out.println("Inserisci quantita' di memoria dello smartphone: ");
                int smartphoneMemory = Integer.parseInt(input.nextLine());

                Prodotto smartphone = new Smartphone(productCode, productName, productBrand,
                        new BigDecimal(productPrice),
                        new BigDecimal(0.22), smartphoneImei, smartphoneMemory);

                products[i] = smartphone;

            }

            else if (productCategoryString.toLowerCase().equals("televisore")) {

                System.out.println("Inserisci la dimensione del televisore (In pollici): ");
                int dimensioneTelevisore = Integer.parseInt(input.nextLine());

                System.out.println("Inserisci se il televisore e' smart o no (true se e' smart altrimenti false): ");
                boolean isSmart = Boolean.parseBoolean(input.nextLine());

                Prodotto televisore = new Televisori(productCode, productName, productBrand,
                        new BigDecimal(productPrice),
                        new BigDecimal(0.22), dimensioneTelevisore, isSmart);

                products[i] = televisore;

            }

        }

        input.close();

        System.out.println("----------------------");

        System.out.println("Ecco il tuo carrello: ");

        for (int y = 0; y < products.length; y++) {
            System.out.println(products[y]);
        }

    }

}
