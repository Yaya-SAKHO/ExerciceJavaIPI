package package1;

public class RenverserChaine {
    public static String renverserChaine(String chaine) {

        String resultat = "";
        int i = 0;

        for (i = chaine.length() - 1; i >= 0; i--) {
            resultat += chaine.charAt(i);
        }

        return resultat;
    }
}
