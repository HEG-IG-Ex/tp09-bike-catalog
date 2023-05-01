package domaine;

import java.util.List;

public class Store {
    List<Bike> catalog;
    TauxTva tva;
    Marge marge;


    public Store(List<Bike> catalog, TauxTva tva, Marge marge) {
        this.catalog = catalog;
        this.tva = tva;
        this.marge = marge;
    }

    public TauxTva getTva() {
        return tva;
    }

    public void setTva(TauxTva tva) {
        this.tva = tva;
    }

    public Marge getMarge() {
        return marge;
    }

    public void setMarge(Marge marge) {
        this.marge = marge;
    }

    public List<Bike> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Bike> catalog) {
        this.catalog = catalog;
    }

    public void displayPriceList(){

    };

}
