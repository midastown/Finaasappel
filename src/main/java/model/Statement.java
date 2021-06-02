package model;

import utils.TimeSheet;

import java.util.ArrayList;

abstract class Statement {

    private String name;
    private String securityID;
    private ArrayList<TimeSheet> timeSheets;

    public Statement(String name, String securityID, ArrayList<TimeSheet> timeSheets) {
        this.name = name;
        this.securityID = securityID;
        this.timeSheets = timeSheets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecurityID() {
        return securityID;
    }

    public void setSecurityID(String securityID) {
        this.securityID = securityID;
    }

    public ArrayList<TimeSheet> getTimeSheets() {
        return timeSheets;
    }

    public void setTimeSheets(ArrayList<TimeSheet> timeSheets) {
        this.timeSheets = timeSheets;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "name='" + name + '\'' +
                ", securityID='" + securityID + '\'' +
                ", timeSheets=" + timeSheets +
                '}';
    }
}
