package utils;

import model.BalanceSheet;
import model.CashFlow;
import model.Income;
import model.Profile;

public class Formater {


    public Formater() {

    }


    public void serveBasics(Profile[] profile) {



        Object[][] table = new String[3][];
        System.out.printf("BASIC INFORMATION: %s\n", profile[0].getSymbol());
        table[0] = new String[] {"Stock Price:", String.format("%f", profile[0].getPrice())};
        table[1] = new String[] {"Market Cap:", String.format("%f", profile[0].getMktCap())};
        table[2] = new String[] {"Industry:", String.format("%s", profile[0].getIndustry())};

        for (Object[] row: table) {
            System.out.format("%-15s%-20s%n", row);
        }

        System.out.println("Description:\n");
        System.out.println("\"" + profile[0].getDescription() + "\"");

    }

    public void serveEssentials(Profile[] profile, Income[] income) {
        double pricePerShare = profile[0].getPrice();
        double earningPerShare = income[0].getEpsdiluted();
        double peRatio = pricePerShare/earningPerShare;

        Object[][] table = new String[3][];
        System.out.printf("MOST ESSENTIALS: %s\n", profile[0].getSymbol());
        table[0] = new String[] {"P/E Ratio:", String.format("%f", peRatio)};
        table[1] = new String[] {"Beta", String.format("%f", profile[0].getBeta())};
        table[2] = new String[] {"Dividend:", String.format("%s", profile[0].getLastDiv())};

        for (Object[] row: table) {
            System.out.format("%-15s%-20s%n", row);
        }
    }

    public void serveStatements(Income[] income, CashFlow[] cashFlow, BalanceSheet[] balanceSheet) {

        Object[][] table = new String[4][];
        System.out.printf("FINANCIAL STATEMENTS: %s\n", income[0].getSymbol());
        table[0] = new String[] {"Net Income:", String.format("%f", income[0].getNetIncome())};
        table[1] = new String[] {"Total Assets:", String.format("%f", balanceSheet[0].getTotalCurrentAssets())};
        table[2] = new String[] {"Total Liabilities:", String.format("%f", balanceSheet[0].getTotalCurrentLiabilities())};
        table[3] = new String[] {"Current Cash on Hand:", String.format("%f", cashFlow[0].getOperatingCashFlow())};

        for (Object[] row: table) {
            System.out.format("%-15s%-20s%n", row);
        }

    }
}
