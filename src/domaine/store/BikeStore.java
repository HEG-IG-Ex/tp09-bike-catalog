package domaine.store;

import domaine.price.PriceCalculator;

import java.util.List;

public class BikeStore<Bike> extends Store{

    public BikeStore(String name, List<Bike> bikes, PriceCalculator pc) {
        super(name, bikes, pc);
    }

}
