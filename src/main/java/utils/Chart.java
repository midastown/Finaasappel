package utils;

import java.util.ArrayList;

public class Chart {

    private String name;
    private String chartype;
    private boolean isPercentage;
    private ArrayList<Double> values;

    public Chart(String name, String chartype, boolean isPercentage, ArrayList<Double> values) {
        this.name = name;
        this.chartype = chartype;
        this.isPercentage = isPercentage;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChartype() {
        return chartype;
    }

    public void setChartype(String chartype) {
        this.chartype = chartype;
    }

    public boolean isPercentage() {
        return isPercentage;
    }

    public void setPercentage(boolean percentage) {
        isPercentage = percentage;
    }

    public ArrayList<Double> getValues() {
        return values;
    }

    public void setValues(ArrayList<Double> values) {
        this.values = values;
    }
}
