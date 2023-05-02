package domaine.bike;

import domaine.price.Margin;
import domaine.price.VATRate;

public abstract class Bike {
    private String marque;
    private String modele;
    private int prix;

    public Bike(String marque, String modele, int prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    /*@Override
    public String toString() { //return marque + " " + modele + " (" + prix + ".- + " + new Margin() + " + " + new VATRate() + ") ==> " + (int)((prix+((double)prix*new Margin().getMarge()/100))*(100+new VATRate().getTaux())/100) + ".-"; }
*/}