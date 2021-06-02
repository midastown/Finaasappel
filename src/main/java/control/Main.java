/*
* Author: Mehdi Hachimi
* License: MIT
* Data provided by Financial Modeling Prep
*/

package control;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import utils.Chart;
import utils.TimeSheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // file reading
        File input = new File("/Users/midastown/dev/Finaasappel/result.json");

        try {


            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();
            JsonArray jsonArrayOfStatements = fileObject.get("result").getAsJsonArray();
            
            // in results
            for (JsonElement statementElement: jsonArrayOfStatements) {

                JsonObject resultJsonObject = statementElement.getAsJsonObject();

                String name = resultJsonObject.get("name").getAsString();
                String securityID = resultJsonObject.get("securityID").getAsString();
                ArrayList<TimeSheet> sheets = new ArrayList<>();

                JsonArray jsonArrayOfTimeSheets = resultJsonObject.get("timeBasedSheets").getAsJsonArray();
                // in timeBasedSheets
                for (JsonElement timeSheetElement: jsonArrayOfTimeSheets){
                    JsonObject timeBasedSheetsJsonObject = timeSheetElement.getAsJsonObject();

                    String sheetName = timeBasedSheetsJsonObject.get("name").getAsString();
                    ArrayList<String> columnHeadings = new ArrayList<>();
                    ArrayList<Chart> charts = new ArrayList<>();

                    JsonArray jsonArrayOfHeadings = timeBasedSheetsJsonObject.get("columnHeadings").getAsJsonArray();
                    // in columnHeadings
                    for (JsonElement date: jsonArrayOfHeadings) {
                        columnHeadings.add(date.getAsString());
                    }
                    // out of column headings


                    JsonArray jsonArrayOfCharts = timeBasedSheetsJsonObject.get("chartData").getAsJsonArray();
                    // in chartData
                    for (JsonElement chartElement: jsonArrayOfCharts) {
                        JsonObject chartDataJsonObject = chartElement.getAsJsonObject();

                        String chartName = chartDataJsonObject.get("name").getAsString();
                        String chartType = chartDataJsonObject.get("chartType").getAsString();
                        boolean isPercentage = chartDataJsonObject.get("isPercentage").getAsBoolean();
                        ArrayList<Double> values = new ArrayList<>();

                        JsonArray jsonArrayOfValues = chartDataJsonObject.get("values").getAsJsonArray();
                        // in values
                        for (JsonElement value: jsonArrayOfValues) {
                            values.add(value.getAsDouble());
                        }
                        // out of values

                        Chart chart = new Chart(chartName, chartType, isPercentage, values);
                        charts.add(chart);
                    }
                    // out of chartData

                    TimeSheet sheet = new TimeSheet(sheetName, columnHeadings, charts);
                    sheets.add(sheet);
                }

                // initializing statements
                if (name.equals("Income Statement")) {
                    Income income = new Income(name, securityID, sheets);
                    System.out.println(income.toString());
                } else if (name.equals("Balance Sheet")) {
                    BalanceSheet balanceSheet = new BalanceSheet(name, securityID, sheets);
                    System.out.println(balanceSheet.toString());
                } else if (name.equals("Cash Flow")) {
                    CashFlow cashFlow = new CashFlow(name, securityID, sheets);
                    System.out.println(cashFlow.toString());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
