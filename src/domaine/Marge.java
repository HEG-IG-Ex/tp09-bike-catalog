package domaine;

public class Marge {
    private int marge = 15;

    public int getMarge() { return marge; }

    @Override
    public String toString() { return "Marge " + marge + "%"; }
}