package domaine.store;

import domaine.bike.Priceable;
import domaine.price.PriceCalculator;

import java.util.List;

public abstract class Store<T extends Priceable> {
    String name;
    List<T> products;
    PriceCalculator pc;

    public Store(String name, List<T> products, PriceCalculator pc ) {
        this.products = products;
        this.pc = pc;
        this.name = name;
    }

    public String displayCatalogWithPriceList(){
        String output = "Catalog of " + this.toString() + " (applying VAT = " + pc.getVat() + "% and " + pc.getMargin() +"%)\n";
        for (T p : products) {
            output += "- " + p.toString() + " => " +pc.getAdjustedPrice(p.getPrice()) + ".-\n";
        }
        return output;
    };

    @Override
    public String toString() {
        return name;
    }
}
