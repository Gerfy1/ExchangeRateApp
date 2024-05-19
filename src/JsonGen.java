import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonGen
{
    public void generateJson (Conversion conversion) throws IOException{
        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        FileWriter register = new FileWriter("register/register.json");
        register.write(gson.toJson(conversion));
        register.close();
    }
}
