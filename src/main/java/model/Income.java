package model;

import utils.TimeSheet;

import java.util.ArrayList;

public class Income extends Statement {

    public Income(String name, String securityID, ArrayList<TimeSheet> timeSheets) {
        super(name, securityID, timeSheets);
    }
}
