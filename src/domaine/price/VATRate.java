package domaine.price;

public class VATRate {
    private double taux;

    public VATRate(double taux) {
        this.taux = taux;
    }

    public double getTaux() { return taux; }

    @Override
    public String toString() { return "Tva " + taux + "%"; }
}