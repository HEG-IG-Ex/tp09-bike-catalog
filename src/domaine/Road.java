package domaine;

public class Road extends Bike {
    private String roues;
    public Road(String marque, String modele, int prix, String roues) {
        super(marque, modele, prix);
        this.roues = roues;
    }

}
