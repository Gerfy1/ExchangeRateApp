import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyBRLUSD teste = new CurrencyBRLUSD();
        System.out.println("Digite o valor para conversão:");
        double valor = sc.nextDouble();

        try {
            Conversion novaconversao = teste.CurrencysBRLUSD(valor);
            System.out.println(novaconversao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}