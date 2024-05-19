import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyEURUSD {
    public Conversion CurrencyEURUSD(double currencyValueEUR) {
        URI apiBRUSD = URI.create("https://v6.exchangerate-api.com/v6/3dea353e5ce7e0cbd8fe6540/pair/AUD/BRL/" + currencyValueEUR);
        HttpRequest request = HttpRequest.newBuilder(apiBRUSD).build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            System.out.println("Não encontrado!");
            System.out.println("Verifique se o valor digitado está correto!");
        }
        return null;
    }
}
