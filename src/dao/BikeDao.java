package dao;

import domaine.bike.BikeType;
import domaine.bike.Bike;
import factories.Company;

import java.util.ArrayList;
import java.util.List;

public class BikeDao {
    private static final String FILENAME = "ListeVelos.csv";

    public static List<Bike> getBikeList() {
        String[][] velos = FileToStr.lireCsv(FILENAME);
        List<Bike> aLst = new ArrayList<>();

        for (String[] velo : velos) {
            BikeType type = velo[0].toLowerCase() == "vtt" ? BikeType.VTT : BikeType.ROAD;
            String marque = velo[1];
            String modele = velo[2];
            int prix = Integer.parseInt(velo[3]);
            String rouesOuCadre = velo[4];
            aLst.add(Company.createBike(type, marque, modele, prix, rouesOuCadre));
        }
        return aLst;
    }
}