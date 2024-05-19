import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonGen {
    public void generateJson(List<Conversion> conversions) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        FileWriter register = new FileWriter("register.json");
        register.write(gson.toJson(conversions));
        register.close();
    }
}
