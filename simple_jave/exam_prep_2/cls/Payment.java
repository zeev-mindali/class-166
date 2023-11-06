package simple_jave.exam_prep_2.cls;

public class Payment {
    private int cash;
    private String mimun;
    private int payments;
    private int monthlyPayment;
    private int totalPayments;

    public Payment(int cash, String mimun, int payments, int monthlyPayment) {
        setCash(cash);
        setMimun(mimun);
        setPayments(payments);
        setMonthlyPayment(monthlyPayment);
        setTotalPayments(monthlyPayment*payments);
    }

    public Payment(int cash){
        this(cash,"",0,0);
    }

    public Payment(String mimun, int payments, int monthlyPayment){
        this(0,mimun,payments,monthlyPayment);
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getMimun() {
        return mimun;
    }

    public void setMimun(String mimun) {
        this.mimun = mimun;
    }

    public int getPayments() {
        return payments;
    }

    public void setPayments(int payments) {
        this.payments = payments;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(int totalPayments) {
        this.totalPayments = totalPayments;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cash=" + cash +
                ", mimun='" + mimun + '\'' +
                ", payments=" + payments +
                ", monthlyPayment=" + monthlyPayment +
                ", totalPayments=" + totalPayments +
                "}\n";
    }
}
