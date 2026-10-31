package taxes;

public class Tax15 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit){
        int tax = (int) ((debit - credit) * 0.15);
        return Math.max(tax, 0);
    }
}
