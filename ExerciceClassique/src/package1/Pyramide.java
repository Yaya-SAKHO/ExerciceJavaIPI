package package1;

public class Pyramide {

    public static void pyramide(char caractere, int hauteur) {
        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(caractere);
            }
            System.out.println();
        }
    }

}