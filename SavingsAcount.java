public class SavingsAcount {
    private double intRate;
    private double savBal;

    public SavingsAcount(){
        this.intRate = 0.0;
        this.savBal = 0.0;
    }

    public SavingsAcount(double intRate, double savBal){
        this.intRate = intRate;
        this.savBal = savBal;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setSavBal(double savBal) {
        this.savBal = savBal;
    }

    public double getSavBal() {
        return savBal;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = ((getIntRate() * getSavBal()) / 12) + getSavBal();
        savBal = monthlyInterest;
        return monthlyInterest;
    }
}
