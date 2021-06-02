package model;

import utils.TimeSheet;

import java.util.ArrayList;

public class BalanceSheet extends Statement{

    public BalanceSheet(String name, String securityID, ArrayList<TimeSheet> timeSheets) {
        super(name, securityID, timeSheets);
    }
}
