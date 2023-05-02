package domaine.price;

public class PriceCalculator<T> {
    public Margin margin;
    public VATRate tax;

    public PriceCalculator(Margin margin, VATRate tax) {
        this.margin = margin;
        this.tax = tax;
    }
}
