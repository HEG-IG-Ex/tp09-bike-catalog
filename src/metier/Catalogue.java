package metier;

import domaine.bike.Bike;
import java.util.ArrayList;


public class Catalogue<T extends Bike> extends ArrayList<T> {
    @Override
    public String toString() {
        String output;
        output = "Pricelist of the catalog is :";
        for (Bike b : this) {
            output += b.toString() + "\n";
        }
        return output;
    }
}