package metier;

import dao.BikeDao;
import domaine.Bike;

public class Catalogue {
    public void afficherListePrix(String magasin) {
        System.out.println("Liste de prix " + magasin + " :");
        for (Bike bike : BikeDao.listeVelos()) { System.out.println(bike); }
    }
}