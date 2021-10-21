package PeeTest;

public class VaccineResponse {
    private boolean eligibleFlag ;
    private String startDate;
    private String endDate;

    public boolean isEligibleFlag() {
        return eligibleFlag;
    }

    public void setEligibleFlag(boolean eligibleFlag) {
        this.eligibleFlag = eligibleFlag;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "VaccineResponse{" +
                "eligibleFlag=" + eligibleFlag +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
