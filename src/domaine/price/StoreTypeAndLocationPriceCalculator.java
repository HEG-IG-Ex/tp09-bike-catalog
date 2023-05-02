package domaine.price;

public class StoreTypeAndLocationPriceCalculator implements PriceCalculator{
    double vat;
    double margin;

    public StoreTypeAndLocationPriceCalculator(double vat, double margin) {
        this.vat = vat;
        this.margin = margin;
    }


    @Override
    public double getAdjustedPrice(int price) {
        return ((price+((double)price*margin))+((double)price*vat));
    }

    @Override
    public double getVat() {
        return vat*100;
    }

    @Override
    public double getMargin() {
        return margin*100;
    }
}
