package samples;

public class NaturalPerson extends Clients {

    public NaturalPerson(int accountNumber, double accountBalance) {
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
        if (money > 0 && (getAccountBalance() - money) >= 0) {
            setAccountBalance(getAccountBalance() - money);
        } else {
            System.out.println("Error");
        }
    }

}
