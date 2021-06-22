package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import model.Profile;

public class Parser {

    public Parser() {

    }

    public Income[] jsonToIncome(String response){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        Income[] income = gson.fromJson(response, Income[].class);
        return income;
    }

    public BalanceSheet[] jsonToBalanceSheet(String response) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        BalanceSheet[] balanceSheet = gson.fromJson(response, BalanceSheet[].class);
        return balanceSheet;
    }

    public CashFlow[] jsonToCashFlow(String response) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        CashFlow[] cashFlow = gson.fromJson(response, CashFlow[].class);
        return cashFlow;
    }

    public Profile[] jsonToProfile(String response) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        Profile[] profile = gson.fromJson(response, Profile[].class);
        return profile;
    }
}
