package model;

//import utils.TimeSheet;
//
//import java.util.ArrayList;

public class Income {

    private String date;
    private String symbol;
    private String reportedCurrency;
    private String fillingDate;
    private String acceptedDate;
    private String period;
    private double revenue;
    private double costOfRevenue;
    private double grossProfit;
    private double grossProfitRatio;
    private double researchAndDevelopmentExpenses;
    private double generalAndAdministrativeExpenses;
    private double sellingAndMarketingExpenses;
    private double otherExpenses;
    private double operatingExpenses;
    private double costAndExpenses;
    private double interestExpense;
    private double depreciationAndAmortization;
    private double ebitda;
    private double ebitdaratio;
    private double operatingIncome;
    private double operatingIncomeRatio;
    private double totalOtherIncomeExpensesNet;
    private double incomeBeforeTax;
    private double incomeBeforeTaxRatio;
    private double incomeTaxExpense;
    private double netIncome;
    private double netIncomeRatio;
    private double eps;
    private double epsdiluted;
    private double weightedAverageShsOut;
    private double weightedAverageShsOutDil;
    private String link;
    private String finalLink;

    public Income() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getReportedCurrency() {
        return reportedCurrency;
    }

    public void setReportedCurrency(String reportedCurrency) {
        this.reportedCurrency = reportedCurrency;
    }

    public String getFillingDate() {
        return fillingDate;
    }

    public void setFillingDate(String fillingDate) {
        this.fillingDate = fillingDate;
    }

    public String getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(double costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public double getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(double grossProfit) {
        this.grossProfit = grossProfit;
    }

    public double getGrossProfitRatio() {
        return grossProfitRatio;
    }

    public void setGrossProfitRatio(double grossProfitRatio) {
        this.grossProfitRatio = grossProfitRatio;
    }

    public double getResearchAndDevelopmentExpenses() {
        return researchAndDevelopmentExpenses;
    }

    public void setResearchAndDevelopmentExpenses(double researchAndDevelopmentExpenses) {
        this.researchAndDevelopmentExpenses = researchAndDevelopmentExpenses;
    }

    public double getGeneralAndAdministrativeExpenses() {
        return generalAndAdministrativeExpenses;
    }

    public void setGeneralAndAdministrativeExpenses(double generalAndAdministrativeExpenses) {
        this.generalAndAdministrativeExpenses = generalAndAdministrativeExpenses;
    }

    public double getSellingAndMarketingExpenses() {
        return sellingAndMarketingExpenses;
    }

    public void setSellingAndMarketingExpenses(double sellingAndMarketingExpenses) {
        this.sellingAndMarketingExpenses = sellingAndMarketingExpenses;
    }

    public double getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public double getOperatingExpenses() {
        return operatingExpenses;
    }

    public void setOperatingExpenses(double operatingExpenses) {
        this.operatingExpenses = operatingExpenses;
    }

    public double getCostAndExpenses() {
        return costAndExpenses;
    }

    public void setCostAndExpenses(double costAndExpenses) {
        this.costAndExpenses = costAndExpenses;
    }

    public double getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(double interestExpense) {
        this.interestExpense = interestExpense;
    }

    public double getDepreciationAndAmortization() {
        return depreciationAndAmortization;
    }

    public void setDepreciationAndAmortization(double depreciationAndAmortization) {
        this.depreciationAndAmortization = depreciationAndAmortization;
    }

    public double getEbitda() {
        return ebitda;
    }

    public void setEbitda(double ebitda) {
        this.ebitda = ebitda;
    }

    public double getEbitdaratio() {
        return ebitdaratio;
    }

    public void setEbitdaratio(double ebitdaratio) {
        this.ebitdaratio = ebitdaratio;
    }

    public double getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(double operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public double getOperatingIncomeRatio() {
        return operatingIncomeRatio;
    }

    public void setOperatingIncomeRatio(double operatingIncomeRatio) {
        this.operatingIncomeRatio = operatingIncomeRatio;
    }

    public double getTotalOtherIncomeExpensesNet() {
        return totalOtherIncomeExpensesNet;
    }

    public void setTotalOtherIncomeExpensesNet(double totalOtherIncomeExpensesNet) {
        this.totalOtherIncomeExpensesNet = totalOtherIncomeExpensesNet;
    }

    public double getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    public void setIncomeBeforeTax(double incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    public double getIncomeBeforeTaxRatio() {
        return incomeBeforeTaxRatio;
    }

    public void setIncomeBeforeTaxRatio(double incomeBeforeTaxRatio) {
        this.incomeBeforeTaxRatio = incomeBeforeTaxRatio;
    }

    public double getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(double incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }

    public double getNetIncomeRatio() {
        return netIncomeRatio;
    }

    public void setNetIncomeRatio(double netIncomeRatio) {
        this.netIncomeRatio = netIncomeRatio;
    }

    public double getEps() {
        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }

    public double getEpsdiluted() {
        return epsdiluted;
    }

    public void setEpsdiluted(double epsdiluted) {
        this.epsdiluted = epsdiluted;
    }

    public double getWeightedAverageShsOut() {
        return weightedAverageShsOut;
    }

    public void setWeightedAverageShsOut(double weightedAverageShsOut) {
        this.weightedAverageShsOut = weightedAverageShsOut;
    }

    public double getWeightedAverageShsOutDil() {
        return weightedAverageShsOutDil;
    }

    public void setWeightedAverageShsOutDil(double weightedAverageShsOutDil) {
        this.weightedAverageShsOutDil = weightedAverageShsOutDil;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFinalLink() {
        return finalLink;
    }

    public void setFinalLink(String finalLink) {
        this.finalLink = finalLink;
    }

}
