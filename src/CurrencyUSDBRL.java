import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyUSDBRL {

    public Conversion CurrencyUSDBRL(double currencyValueUSD) {
        URI apiLink = URI.create("https://v6.exchangerate-api.com/v6/3dea353e5ce7e0cbd8fe6540/pair/USD/BRL/"+ currencyValueUSD);
        HttpRequest request = HttpRequest.newBuilder(apiLink).build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Conversion.class);
        } catch (Exception e) {
            System.out.println("Not found!\nCheck that the value entered is correct!");
        }
        return null;
    }
}
