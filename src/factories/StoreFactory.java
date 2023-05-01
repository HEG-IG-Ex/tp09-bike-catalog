package factories;

import domaine.Bike;
import domaine.Marge;
import domaine.PriceCalculator;
import domaine.TauxTva;

public interface StoreFactory {
    Bike createBike(String marque, String modele, double prix);
    PriceCalculator createPriceCalculator(Marge marge, TauxTva tauxTVA);
}
