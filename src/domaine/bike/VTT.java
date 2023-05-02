package domaine.bike;


public class VTT extends Bike {
    private String cadre;
    public VTT(String marque, String modele, int prix, String cadre) {
        super(marque, modele, prix);
        this.cadre = cadre;
    }

}
