package factories;

import domaine.bike.Bike;
import domaine.bike.BikeType;
import domaine.bike.Road;
import domaine.bike.VTT;
import domaine.price.Margin;
import domaine.price.PriceCalculator;
import domaine.price.VATRate;

public abstract class StoreFactory {
    PriceCalculator priceCalculator;

    Bike createBike(BikeType t, String marque, String modele, int prix, String specific){
        switch (t) {
            case VTT:
                return new VTT(marque, modele, prix, specific);

            case ROAD:
                return new Road(marque, modele, prix, specific);

            default:
                return null;
        }
    };

    public void setPriceCalulator(PriceCalculator p) {
        this.priceCalculator = p;
    }
}
