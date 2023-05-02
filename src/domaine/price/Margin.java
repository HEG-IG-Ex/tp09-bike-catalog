package domaine.price;

public class Margin {
    private int marge;

    public Margin(int marge) {
        this.marge = marge;
    }

    public int getMarge() { return marge; }

    @Override
    public String toString() { return "Margin " + marge + "%"; }
}