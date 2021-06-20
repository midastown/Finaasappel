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
        /*
         API call for income-statement from FMP
         TODO: need to change this api call from Buffer READER to httpRequest -> response.json()

            public static void main(String[] args) throws InterruptedException, IOException {
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://bb-finance.p.rapidapi.com/stock/get-financials?id=aapl%3Aus")).header("x-rapidapi-key", "3840656be8msh7400305a33802e8p121c10jsn78807a131cea").header("x-rapidapi-host", "bb-finance.p.rapidapi.com").method("GET", BodyPublishers.noBody()).build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
                System.out.println((String)response.body());
            }
        }
        */
//        String stock = "AAPL";
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
//                "https://financialmodelingprep.com/api/v3/income-statement/" + stock + "?" + "limit" + "=" + "1" + "&" + "apikey=" + "424404023000cb19d0f92e1c9de1637f")).method("GET", HttpRequest.BodyPublishers.noBody()).build();
//
//        System.out.println(request.toString());
//
//        HttpResponse response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println((String) response[0].body());




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


//        // file reading
//        File input = new File("/Users/midastown/dev/Finaasappel/result.json");
//
//        try {
//
//
//            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
//            JsonObject fileObject = fileElement.getAsJsonObject();
//            JsonArray jsonArrayOfStatements = fileObject.get("result").getAsJsonArray();
//
//            // in results
//            for (JsonElement statementElement: jsonArrayOfStatements) {
//
//                JsonObject resultJsonObject = statementElement.getAsJsonObject();
//
//                String name = resultJsonObject.get("name").getAsString();
//                String securityID = resultJsonObject.get("securityID").getAsString();
//                ArrayList<TimeSheet> sheets = new ArrayList<>();
//
//                JsonArray jsonArrayOfTimeSheets = resultJsonObject.get("timeBasedSheets").getAsJsonArray();
//                // in timeBasedSheets
//                for (JsonElement timeSheetElement: jsonArrayOfTimeSheets){
//                    JsonObject timeBasedSheetsJsonObject = timeSheetElement.getAsJsonObject();
//
//                    String sheetName = timeBasedSheetsJsonObject.get("name").getAsString();
//                    ArrayList<String> columnHeadings = new ArrayList<>();
//                    ArrayList<Chart> charts = new ArrayList<>();
//
//                    JsonArray jsonArrayOfHeadings = timeBasedSheetsJsonObject.get("columnHeadings").getAsJsonArray();
//                    // in columnHeadings
//                    for (JsonElement date: jsonArrayOfHeadings) {
//                        columnHeadings.add(date.getAsString());
//                    }
//                    // out of column headings
//
//
//                    JsonArray jsonArrayOfCharts = timeBasedSheetsJsonObject.get("chartData").getAsJsonArray();
//                    // in chartData
//                    for (JsonElement chartElement: jsonArrayOfCharts) {
//                        JsonObject chartDataJsonObject = chartElement.getAsJsonObject();
//
//                        String chartName = chartDataJsonObject.get("name").getAsString();
//                        String chartType = chartDataJsonObject.get("chartType").getAsString();
//                        boolean isPercentage = chartDataJsonObject.get("isPercentage").getAsBoolean();
//                        ArrayList<Double> values = new ArrayList<>();
//
//                        JsonArray jsonArrayOfValues = chartDataJsonObject.get("values").getAsJsonArray();
//                        // in values
//                        for (JsonElement value: jsonArrayOfValues) {
//                            values.add(value.getAsDouble());
//                        }
//                        // out of values
//
//                        Chart chart = new Chart(chartName, chartType, isPercentage, values);
//                        charts.add(chart);
//                    }
//                    // out of chartData
//
//                    TimeSheet sheet = new TimeSheet(sheetName, columnHeadings, charts);
//                    sheets.add(sheet);
//                }
//
//                // initializing statements
//                if (name.equals("Income Statement")) {
//                    Income income = new Income(name, securityID, sheets);
//                    System.out.println(income.toString());
//                } else if (name.equals("Balance Sheet")) {
//                    BalanceSheet balanceSheet = new BalanceSheet(name, securityID, sheets);
//                    System.out.println(balanceSheet.toString());
//                } else if (name.equals("Cash Flow")) {
//                    CashFlow cashFlow = new CashFlow(name, securityID, sheets);
//                    System.out.println(cashFlow.toString());
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
