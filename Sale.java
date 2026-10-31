public class Sale extends  Deal{
    public String name;
    public int price;

    public Sale(String name, int price){
        super("Продажа " + name + " на " + price + " руб", 0, price);
    }
}
