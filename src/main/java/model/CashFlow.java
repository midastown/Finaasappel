package model;

import utils.TimeSheet;

import java.util.ArrayList;

public class CashFlow{

    private String date;
    private String symbol;
    private String reportedCurrency;
    private String fillingDate;
    private String acceptedDate;
    private String period;
    private double netIncome;
    private double depreciationAndAmortization;
    private double deferredIncomeTax;
    private double stockBasedCompensation;
    private double changeInWorkingCapital;
    private double accountsReceivables;
    private double inventory;
    private double accountsPayables;
    private double otherWorkingCapital;
    private double otherNonCashItems;
    private double netCashProvidedByOperatingActivities;
    private double investmentsInPropertyPlantAndEquipment;
    private double acquisitionsNet;
    private double purchasesOfInvestments;
    private double salesMaturitiesOfInvestments;
    private double otherInvestingActivites;
    private double netCashUsedForInvestingActivites;
    private double debtRepayment;
    private double commonStockIssued;
    private double commonStockRepurchased;
    private double dividendsPaid;
    private double otherFinancingActivites;
    private double netCashUsedProvidedByFinancingActivities;
    private double effectOfForexChangesOnCash;
    private double netChangeInCash;
    private double cashAtEndOfPeriod;
    private double cashAtBeginningOfPeriod;
    private double operatingCashFlow;
    private double capitalExpenditure;
    private double freeCashFlow;
    private String link;
    private String finalLink;

    public CashFlow() {

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

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }

    public double getDepreciationAndAmortization() {
        return depreciationAndAmortization;
    }

    public void setDepreciationAndAmortization(double depreciationAndAmortization) {
        this.depreciationAndAmortization = depreciationAndAmortization;
    }

    public double getDeferredIncomeTax() {
        return deferredIncomeTax;
    }

    public void setDeferredIncomeTax(double deferredIncomeTax) {
        this.deferredIncomeTax = deferredIncomeTax;
    }

    public double getStockBasedCompensation() {
        return stockBasedCompensation;
    }

    public void setStockBasedCompensation(double stockBasedCompensation) {
        this.stockBasedCompensation = stockBasedCompensation;
    }

    public double getChangeInWorkingCapital() {
        return changeInWorkingCapital;
    }

    public void setChangeInWorkingCapital(double changeInWorkingCapital) {
        this.changeInWorkingCapital = changeInWorkingCapital;
    }

    public double getAccountsReceivables() {
        return accountsReceivables;
    }

    public void setAccountsReceivables(double accountsReceivables) {
        this.accountsReceivables = accountsReceivables;
    }

    public double getInventory() {
        return inventory;
    }

    public void setInventory(double inventory) {
        this.inventory = inventory;
    }

    public double getAccountsPayables() {
        return accountsPayables;
    }

    public void setAccountsPayables(double accountsPayables) {
        this.accountsPayables = accountsPayables;
    }

    public double getOtherWorkingCapital() {
        return otherWorkingCapital;
    }

    public void setOtherWorkingCapital(double otherWorkingCapital) {
        this.otherWorkingCapital = otherWorkingCapital;
    }

    public double getOtherNonCashItems() {
        return otherNonCashItems;
    }

    public void setOtherNonCashItems(double otherNonCashItems) {
        this.otherNonCashItems = otherNonCashItems;
    }

    public double getNetCashProvidedByOperatingActivities() {
        return netCashProvidedByOperatingActivities;
    }

    public void setNetCashProvidedByOperatingActivities(double netCashProvidedByOperatingActivities) {
        this.netCashProvidedByOperatingActivities = netCashProvidedByOperatingActivities;
    }

    public double getInvestmentsInPropertyPlantAndEquipment() {
        return investmentsInPropertyPlantAndEquipment;
    }

    public void setInvestmentsInPropertyPlantAndEquipment(double investmentsInPropertyPlantAndEquipment) {
        this.investmentsInPropertyPlantAndEquipment = investmentsInPropertyPlantAndEquipment;
    }

    public double getAcquisitionsNet() {
        return acquisitionsNet;
    }

    public void setAcquisitionsNet(double acquisitionsNet) {
        this.acquisitionsNet = acquisitionsNet;
    }

    public double getPurchasesOfInvestments() {
        return purchasesOfInvestments;
    }

    public void setPurchasesOfInvestments(double purchasesOfInvestments) {
        this.purchasesOfInvestments = purchasesOfInvestments;
    }

    public double getSalesMaturitiesOfInvestments() {
        return salesMaturitiesOfInvestments;
    }

    public void setSalesMaturitiesOfInvestments(double salesMaturitiesOfInvestments) {
        this.salesMaturitiesOfInvestments = salesMaturitiesOfInvestments;
    }

    public double getOtherInvestingActivites() {
        return otherInvestingActivites;
    }

    public void setOtherInvestingActivites(double otherInvestingActivites) {
        this.otherInvestingActivites = otherInvestingActivites;
    }

    public double getNetCashUsedForInvestingActivites() {
        return netCashUsedForInvestingActivites;
    }

    public void setNetCashUsedForInvestingActivites(double netCashUsedForInvestingActivites) {
        this.netCashUsedForInvestingActivites = netCashUsedForInvestingActivites;
    }

    public double getDebtRepayment() {
        return debtRepayment;
    }

    public void setDebtRepayment(double debtRepayment) {
        this.debtRepayment = debtRepayment;
    }

    public double getCommonStockIssued() {
        return commonStockIssued;
    }

    public void setCommonStockIssued(double commonStockIssued) {
        this.commonStockIssued = commonStockIssued;
    }

    public double getCommonStockRepurchased() {
        return commonStockRepurchased;
    }

    public void setCommonStockRepurchased(double commonStockRepurchased) {
        this.commonStockRepurchased = commonStockRepurchased;
    }

    public double getDividendsPaid() {
        return dividendsPaid;
    }

    public void setDividendsPaid(double dividendsPaid) {
        this.dividendsPaid = dividendsPaid;
    }

    public double getOtherFinancingActivites() {
        return otherFinancingActivites;
    }

    public void setOtherFinancingActivites(double otherFinancingActivites) {
        this.otherFinancingActivites = otherFinancingActivites;
    }

    public double getNetCashUsedProvidedByFinancingActivities() {
        return netCashUsedProvidedByFinancingActivities;
    }

    public void setNetCashUsedProvidedByFinancingActivities(double netCashUsedProvidedByFinancingActivities) {
        this.netCashUsedProvidedByFinancingActivities = netCashUsedProvidedByFinancingActivities;
    }

    public double getEffectOfForexChangesOnCash() {
        return effectOfForexChangesOnCash;
    }

    public void setEffectOfForexChangesOnCash(double effectOfForexChangesOnCash) {
        this.effectOfForexChangesOnCash = effectOfForexChangesOnCash;
    }

    public double getNetChangeInCash() {
        return netChangeInCash;
    }

    public void setNetChangeInCash(double netChangeInCash) {
        this.netChangeInCash = netChangeInCash;
    }

    public double getCashAtEndOfPeriod() {
        return cashAtEndOfPeriod;
    }

    public void setCashAtEndOfPeriod(double cashAtEndOfPeriod) {
        this.cashAtEndOfPeriod = cashAtEndOfPeriod;
    }

    public double getCashAtBeginningOfPeriod() {
        return cashAtBeginningOfPeriod;
    }

    public void setCashAtBeginningOfPeriod(double cashAtBeginningOfPeriod) {
        this.cashAtBeginningOfPeriod = cashAtBeginningOfPeriod;
    }

    public double getOperatingCashFlow() {
        return operatingCashFlow;
    }

    public void setOperatingCashFlow(double operatingCashFlow) {
        this.operatingCashFlow = operatingCashFlow;
    }

    public double getCapitalExpenditure() {
        return capitalExpenditure;
    }

    public void setCapitalExpenditure(double capitalExpenditure) {
        this.capitalExpenditure = capitalExpenditure;
    }

    public double getFreeCashFlow() {
        return freeCashFlow;
    }

    public void setFreeCashFlow(double freeCashFlow) {
        this.freeCashFlow = freeCashFlow;
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
