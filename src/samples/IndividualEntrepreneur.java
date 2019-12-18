package samples;

public class IndividualEntrepreneur extends Clients {
    public IndividualEntrepreneur(int accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void insertCoin(double money) {
        double k = 0;
        if(money >  0){
            if(money >= 1000){
                k = ((money / 100)/2);
            }else if(money < 1000){
                k = (money / 100);
            }
            setAccountBalance(getAccountBalance() + money);
            setAccountBalance(getAccountBalance() - k);
        }else{
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
