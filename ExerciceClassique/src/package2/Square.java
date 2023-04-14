package package2;

public class Square extends Rectangle {

    public Square(int cote) {
        super(cote, cote);
    }

    public int calculerSurface() {
        return getLongueur() * getLargeur();
    }
}