/*
* Author: Mehdi Hachimi
* License: MIT
* Data provided by Financial Modeling Prep
*/

package control;

import com.google.gson.*;
import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import org.yaml.snakeyaml.Yaml;
import utils.Chart;
import utils.TimeSheet;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        // Reading api key from YAML config file
        Yaml yaml = new Yaml();
        InputStream yamlStream = new FileInputStream(new File("config.yml"));
        Map<String, Object> data = yaml.load(yamlStream);
        String key = (String) data.get("key");

        // API CALL example for income-statement
        String stock = "AAPL";
        URL url = null;
        try {
            url = new URL("https://financialmodelingprep.com/api/v3/income-statement/" + stock + "?limit=1&apikey=" + key);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        StringBuffer response = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            for (String line; (line = reader.readLine()) != null;) {
                response.append(line);
                // System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // mimicking status response of 400 BAD_REQUEST
        if (response.toString().equals("[ ]")) {
            System.out.println("we got an empty response");
        } else {
            System.out.println("we got a good response");
        }

        // JSON deserialisation using GSON
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        Income[] income = gson.fromJson(response.toString(), Income[].class);

        // show example
        String symbyol = income[0].getSymbol();
        System.out.println(symbyol);
    }
}
