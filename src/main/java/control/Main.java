/*
* Author: Mehdi Hachimi
* License: MIT
* Data provided by Financial Modeling Prep
*/

package control;

import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import model.Profile;
import utils.ApiCall;
import utils.Parser;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        String response;
        ApiCall caller =  new ApiCall();
        Parser parse = new Parser();



        response = caller.call("AAPL", "income", true);
        if (response.equals("[ ]") || response.equals("null")) {
            System.out.println("we got an empty response");
        } else {
            System.out.println("we got a good response");
        }
        Income[] income = parse.jsonToIncome(response);

        response = caller.call("AAPL", "profile", false);
        if (response.equals("[ ]") || response.equals("null")) {
            System.out.println("we got an empty response");
        } else {
            System.out.println("we got a good response");
        }
        Profile[] profile = parse.jsonToProfile(response);

        response = caller.call("AAPL","cash-flow", true);
        if (response.equals("[ ]") || response.equals("null")) {
            System.out.println("we got an empty response");
        } else {
            System.out.println("we got a good response");
        }
        CashFlow[] cashFlow = parse.jsonToCashFlow(response);

        response = caller.call("AAPL","balance-sheet", true);
        if (response.equals("[ ]") || response.equals("null")) {
            System.out.println("we got an empty response");
        } else {
            System.out.println("we got a good response");
        }
        BalanceSheet[] balanceSheet = parse.jsonToBalanceSheet(response);



        // show example
        String symbyol = income[0].getSymbol();
        System.out.println(symbyol);
    }
}
