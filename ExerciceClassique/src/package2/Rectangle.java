package package2;

public class Rectangle {
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void display() {
        for (int i = 0; i<longueur; i++){
            for (int j = 0 ; j<largeur ; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }
}
