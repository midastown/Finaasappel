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

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        URL url = null;
        try {
            url = new URL("https://financialmodelingprep.com/api/v3/income-statement/AAPL?limit=1&apikey=YOUR-API-KEY");
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


        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        Income[] income = gson.fromJson(response.toString(), Income[].class);

        String symbyol = income[0].getSymbol();

        System.out.println(symbyol);
    }
}
