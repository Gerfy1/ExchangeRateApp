import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        JsonGen generator = new JsonGen();
        List<Conversion> conversions = new ArrayList<>();
        System.out.println("****************************************\n            Exchange v0.1 \n****************************************");

        while (true) {
            System.out.println("Enter your option number:\n1: BRL to > USD\n2: USD to > BRL\n3: BRL to > AUD\n4: AUD to > BRL\n5: EUR to > USD\n6: USD to > EUR");
            try {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        CurrencyBRLUSD BRLforUSD = new CurrencyBRLUSD();
                        System.out.println("Enter BRL amount R$:");
                        double amountBRLtoUSD = sc.nextDouble();
                        Conversion BRLtoUSD = BRLforUSD.CurrencysBRLUSD(amountBRLtoUSD);
                        System.out.println(String.format("Converted: $%.2f", BRLtoUSD.conversion_result()));
                        conversions.add(BRLtoUSD);
                        break;
                    case 2:
                        CurrencyUSDBRL USDforBRL = new CurrencyUSDBRL();
                        System.out.println("Enter USD amount $:");
                        double amountUSDtoBRL = sc.nextDouble();
                        Conversion USDtoBRL = USDforBRL.CurrencyUSDBRL(amountUSDtoBRL);
                        System.out.println(String.format("Converted: R$%.2f", USDtoBRL.conversion_result()));
                        conversions.add(USDtoBRL);
                        break;
                    case 3:
                        CurrencyBRLAUD BRLforAUD = new CurrencyBRLAUD();
                        System.out.println("Enter BRL amount R$:");
                        double amountBRLtoAUD = sc.nextDouble();
                        Conversion BRLtoAUD = BRLforAUD.CurrencyBRLAUD(amountBRLtoAUD);
                        System.out.println(String.format("Converted A$%.2f", BRLtoAUD.conversion_result()));
                        conversions.add(BRLtoAUD);
                        break;
                    case 4:
                        CurrencyAUDBRL AUDforBRL = new CurrencyAUDBRL();
                        System.out.println("Enter AUD amount A$:");
                        double amountAUDtoBRL = sc.nextDouble();
                        Conversion AUDtoBRL = AUDforBRL.CurrencyAUDBRL(amountAUDtoBRL);
                        System.out.println(String.format("Converted: R$%.2f", AUDtoBRL.conversion_result()));
                        conversions.add(AUDtoBRL);
                        break;
                    case 5:
                        CurrencyEURUSD EURforUSD = new CurrencyEURUSD();
                        System.out.println("Enter EUR amount €:");
                        double amountEURtoUSD = sc.nextDouble();
                        Conversion EURtoUSD = EURforUSD.CurrencyEURUSD(amountEURtoUSD);
                        System.out.println(String.format("Converted: $%.2f", EURtoUSD.conversion_result()));
                        conversions.add(EURtoUSD);
                        break;
                    case 6:
                        CurrencyUSDEUR USDforEUR = new CurrencyUSDEUR();
                        System.out.println("Enter USD amount $:");
                        double amountUSDtoEUR = sc.nextDouble();
                        Conversion USDtoEUR = USDforEUR.CurrencyUSDEUR(amountUSDtoEUR);
                        System.out.println(String.format("Converted: €%.2f", USDtoEUR.conversion_result()));
                        conversions.add(USDtoEUR);
                        break;
                    case 7:
                        System.out.println("Exting...\nAppreciate!");
                        System.exit(1001);
                    default:
                        System.out.println("Invalid Option");
                }
                generator.generateJson(conversions);
            } catch (InputMismatchException e) {
                System.out.println("An error has occurred!\nChoose from the option among the numbers!");
                sc.next();
            }
        }
    }
}