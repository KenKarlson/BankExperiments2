package samples;

public abstract class Clients {
    private int accountNumber;
    private double accountBalance;

    public Clients(int accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public final int getAccountNumber() {
        return accountNumber;
    }
    public final double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void showInfo(){
        System.out.println(getAccountNumber());
        System.out.println(getAccountBalance());
    }
    public abstract void insertCoin(double money);
    public abstract void removeCoin(double money);
}
