package factories;

import domaine.bike.Bike;
import domaine.bike.BikeType;
import domaine.bike.Road;
import domaine.bike.VTT;

public class BikeFactory {
    private BikeFactory instance;

    private BikeFactory() {
    }

    public BikeFactory getInstance(){
        if(instance == null){
            instance = new BikeFactory();
        }
        return instance;
    }

    public Bike createBike(BikeType t, String marque, String modele, int prix, String specific){
        switch (t) {
            case VTT:
                return new VTT(marque, modele, prix, specific);

            case ROAD:
                return new Road(marque, modele, prix, specific);

            default:
                return null;
        }
    }
}
