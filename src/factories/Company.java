package factories;

import domaine.bike.Bike;
import domaine.bike.BikeType;
import domaine.bike.Road;
import domaine.bike.VTT;
import domaine.price.PriceCalculator;
import domaine.price.StoreTypeAndLocationPriceCalculator;
import domaine.store.*;

import java.util.List;

public class Company {
    public static Store createStore(ProductType pt, String name, List<Bike> products, PriceCalculator pc){
        switch (pt) {
            case BIKE:
                return new BikeStore(name, products, pc);
            default:
                return null;
        }
    }

    public static Bike createBike(BikeType t, String marque, String modele, int prix, String specific){
        switch (t) {
            case VTT:
                return new VTT(marque, modele, prix, specific);

            case ROAD:
                return new Road(marque, modele, prix, specific);

            default:
                return null;
        }
    };

    public static PriceCalculator createPriceCalculator(Location l, StoreType st) {
        double vat = 0.0;
        double margin = 0.0;

        switch (l) {
            case FRANCE:
                vat = 0.2;
                break;

            case SWITZERLAND:
                vat = 0.077;
                break;
        }


        switch (st) {
            case RESELLER:
                margin = 0.2;
                break;

            case WHOLESALER:
                margin = 0.15;
                break;
        }

        return new StoreTypeAndLocationPriceCalculator(vat, margin);

    }
}
