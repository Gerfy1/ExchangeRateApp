import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("****************************************\n               Exchange \n****************************************");
            System.out.println("Choose your Option:\n(1) BRL > USD\n(2) USD > BRL");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    CurrencyBRLUSD BRLforUSD = new CurrencyBRLUSD();
                    System.out.println("Enter BRL amount");
                    double amountBRLtoUSD = sc.nextDouble();
                    Conversion BRLtoUSD = BRLforUSD.CurrencysBRLUSD(amountBRLtoUSD);
                    System.out.println("Converted: " +BRLtoUSD);
                    break;
                case 2:
                    CurrencyUSDBRL USDforBRL = new CurrencyUSDBRL();
                    System.out.println("Enter USD amount");
                    double amountUSDtoBRL = sc.nextDouble();
                    Conversion USDtoBRL = USDforBRL.CurrencyUSDBRL(amountUSDtoBRL);
                    System.out.println("Converted: " +USDtoBRL);
                    break;
                case 3:
                    CurrencyBRLAUD BRLforAUD = new CurrencyBRLAUD();
                    System.out.println("Enter BRL amount");
                    double amountBRLtoAUD = sc.nextDouble();
                    Conversion BRLtoAUD = BRLforAUD.CurrencyBRLAUD(amountBRLtoAUD);
                    System.out.println("Converted: " +BRLtoAUD);
                    break;
                case 4:
                    CurrencyAUDBRL AUDforBRL = new CurrencyAUDBRL();
                    System.out.println("Enter AUD amount");
                    double amountAUDtoBRL = sc.nextDouble();
                    Conversion AUDtoBRL = AUDforBRL.CurrencyAUDBRL(amountAUDtoBRL);
                    System.out.println("Converted: " +AUDtoBRL);
                    break;
                case 5:
                    CurrencyEURUSD EURforUSD = new CurrencyEURUSD();
                    System.out.println("Enter EUR amount");
                    double amountEURtoUSD = sc.nextDouble();
                    Conversion EURtoUSD = EURforUSD.CurrencyEURUSD(amountEURtoUSD);
                    System.out.println("Converted: " +EURtoUSD);
                    break;
                case 6:
                    CurrencyUSDEUR USDforEUR = new CurrencyUSDEUR();
                    System.out.println("Enter USD amount");
                    double amountUSDtoEUR = sc.nextDouble();
                    Conversion USDtoEUR = USDforEUR.CurrencyUSDEUR(amountUSDtoEUR);
                    System.out.println("Converted: " +USDtoEUR);
                    break;
                case 7:
                    System.out.println("Exting....");
                    System.exit(202);
                default:
                    System.out.println("Invalid Option");
            }
        }

//        CurrencyBRLUSD teste = new CurrencyBRLUSD();
//        System.out.println("Digite o valor para conversão:");
//        double valor = sc.nextDouble();
//
//        try {
//            Conversion novaconversao = teste.CurrencysBRLUSD(valor);
//            System.out.println(novaconversao);
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());/
//        }
    }
}