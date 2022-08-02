package week02.day02;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public double getYield(int days) {
        return fund * (interestRate / 100.0) * days / 365;
    }

    public double close(int days) {
        int actualDays = days > 365 ? 365 : days;
        double fullPayment = (fund + getYield(actualDays)) * (1 - cost / 100);
        double result = active ? fullPayment : 0;
        active = false;
        return result;
    }

}
