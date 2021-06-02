package model;

import utils.TimeSheet;

import java.util.ArrayList;

public class CashFlow extends Statement{

    public CashFlow(String name, String securityID, ArrayList<TimeSheet> timeSheets){
        super(name, securityID, timeSheets);
    }
}
