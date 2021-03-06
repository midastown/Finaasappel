package utils;

import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import model.Profile;

public class CasesCTLR {
    private int i_start, i_end;
    private String response;
    private Parser parse;
    private ApiCall apiCaller;
    private Formater formater;
    private Income[] income;
    private Profile[] profile;
    private CashFlow[] cashFlow;
    private BalanceSheet[] balanceSheet;
    private final boolean[] limits = {false, true, true, true};
    private final String[] components = {"profile", "income", "cash-flow", "balance-sheet"};

    public CasesCTLR() {
        this.apiCaller = new ApiCall();
        this.formater = new Formater();
        this.parse = new Parser();
    }

    public void serve(String stock, int choice) {
        setComponentAndLimit(choice);
        for (int i = i_start; i < i_end; i++) {
            response = apiCaller.call(stock, components[i], limits[i]);
            if (statusGreen()){
                jsonToObject(components[i]);
            }
        }

        if (choice == 1) {
            formater.serveBasics(profile);
        } else if (choice == 2) {
            formater.serveEssentials(profile, income);
        } else {
            formater.serveStatements(income, cashFlow, balanceSheet);
        }

    }

    private void jsonToObject(String component){
        switch (component) {
            case "profile":
                profile = parse.jsonToObject(response, Profile[].class);
                break;
            case "income":
                income = parse.jsonToObject(response, Income[].class);
                break;
            case "cash-flow":
                cashFlow = parse.jsonToObject(response, CashFlow[].class);
                break;
            case "balance-sheet":
                balanceSheet = parse.jsonToObject(response, BalanceSheet[].class);
                break;
        }
    }

    private void setComponentAndLimit(int choice) {
        if (choice == 1) {
            i_start = 0;
            i_end = 1;
        } else if (choice == 2) {
            i_start = 0;
            i_end = 2;
        } else if (choice == 3) {
            i_start = 1;
            i_end = 4;
        }
    }

    private boolean statusGreen(){
        if (response.equals("[ ]") || response.equals("null")) {
            return false;
        } else {
            return true;
        }
    }

}
