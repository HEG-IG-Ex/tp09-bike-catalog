package domaine.store;

import domaine.bike.Bike;
import domaine.price.Margin;
import domaine.price.PriceCalculator;
import domaine.price.VATRate;
import metier.Catalogue;

import java.util.List;

public class Store {
    Catalogue<Bike> bikes;
    PriceCalculator pc;


    public Store(List<Bike> bikes) {
        this.bikes = (Catalogue<Bike>) bikes;
    }

    public void displayPriceList(){
        this.bikes.displayPriceList();
    };

}
