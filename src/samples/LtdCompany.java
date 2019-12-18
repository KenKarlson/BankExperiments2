package samples;

public class LtdCompany extends Clients{
    public LtdCompany(int accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void insertCoin(double money) {
        if (money > 0) {
            setAccountBalance(getAccountBalance() + money);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void removeCoin(double money) {
        if (money > 0 && (getAccountBalance() - (money+(money/100.0))) >= 0) {
            setAccountBalance(getAccountBalance() - money);
            System.out.println("to issue " + money);
            setAccountBalance(getAccountBalance() - (money/100));
            System.out.println("balance " + getAccountBalance());
        } else {
            System.out.println("Error");
        }
    }
}
