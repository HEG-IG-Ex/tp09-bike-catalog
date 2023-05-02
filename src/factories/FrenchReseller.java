package factories;

import domaine.price.Margin;
import domaine.price.PriceCalculator;
import domaine.price.VATRate;

public class FrenchReseller extends StoreFactory{
    @Override
    public PriceCalculator createPriceCalculator() {
        return new PriceCalculator(new Margin(20), new VATRate(7.7));
    }
}
