import samples.LtdCompany;
import samples.NaturalPerson;

public class Main {
    public static void main(String[] args) {

        NaturalPerson ns = new NaturalPerson(1, 1000);
        ns.insertCoin(500);
        ns.removeCoin(1250);
        ns.showInfo();

        LtdCompany lt = new LtdCompany(2, 500);
        lt.insertCoin(500);
        lt.removeCoin(100);
        lt.showInfo();



        double x = 100.0;
        System.out.println(x + (x / 100));
        double y = x;
        System.out.println(y + (y * 0.01));

    }
}
