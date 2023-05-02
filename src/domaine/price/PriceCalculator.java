package domaine.price;

public interface PriceCalculator {
    double getAdjustedPrice(int price);
    double getVat();
    double getMargin();
}
