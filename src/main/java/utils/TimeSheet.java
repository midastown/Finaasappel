package utils;


import java.util.ArrayList;

public class TimeSheet {

    private String name;
    private ArrayList<String> colomnHeading;
    private ArrayList<Chart> chartData;

    public TimeSheet(String name, ArrayList<String> colomnHeading, ArrayList<Chart> chartdata){
        this.name = name;
        this.colomnHeading = colomnHeading;
        this.chartData = chartdata;
    }

    @Override
    public String toString() {
        return "TimeSheet{" +
                "name='" + name + '\'' +
                ", colomnHeading=" + colomnHeading +
                ", chartData=" + chartData +
                '}';
    }
}
