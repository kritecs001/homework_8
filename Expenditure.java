public class Expenditure extends Deal{
    public String name;
    public int price;

    public Expenditure(String name, int price){
        super("Покупка " + name + " на " + price + " руб.", price, 0);
    }
}
