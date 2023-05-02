package domaine.bike;

import domaine.price.PriceCalculator;

public abstract class Bike implements Priceable {
    private String marque;
    private String modele;
    private int price;

    public Bike(String marque, String modele, int price) {
        this.marque = marque;
        this.modele = modele;
        this.price = price;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() { return marque + " " + modele + " (" + price + ".-)"; }
}