package utils;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class ApiCall {

    private String apikey;

    public ApiCall()  {
        // Reading api key from YAML config file
        Yaml yaml = new Yaml();

        InputStream yamlStream = null;
        try {
            yamlStream = new FileInputStream(new File("config.yml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String, Object> data = yaml.load(yamlStream);
        this.apikey = (String) data.get("key");

    }

    public String call(String stock, String component , boolean isLimit) {

        String limit = isLimit ? "limit=120&" : "";

        if (!component.equals("profile")) {
            component += "-statement";
        }

        String urali = "https://financialmodelingprep.com/api/v3/" + component + "/" + stock + "?" + limit + "apikey=" + apikey;



        URL url = null;
        try {
            url = new URL(urali);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        StringBuffer response = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            for (String line; (line = reader.readLine()) != null;) {
                response.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response.toString();
    }

}
