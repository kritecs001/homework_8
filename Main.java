import taxes.Tax15;
import taxes.Tax6;

public class Main{
    public static void main(String[] args){
        Company company1 = new Company("BMW", new Tax6());

        company1.shiftMoney(150000);

        company1.shiftMoney(-30000);
        company1.shiftMoney(-20000);

        company1.payTaxes();

        company1.setTaxSystem(new Tax15());

        company1.shiftMoney(200000);
        company1.shiftMoney(-50000);

        company1.payTaxes();

        Deal[] deals = {
                new Sale("Ноутбук", 1000),
                new Expenditure("Бумага", 300),
                new Sale("Наушники", 11000)
        };

        company1.applyDeals(deals);
    }
}