import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Renverser une chaîne de caractères
        String chaine = "Bonjour";
        String renverseChaine = RenverserChaine.renverserChaine(chaine);
        System.out.printf("Chaine: " + chaine);
        System.out.printf("\nChaine renverser: " + renverseChaine);

        //Pyamide
        System.out.printf("\npackage1.Pyramide:\n");
        Pyramide.pyramide('x',10);

        //Nombre Aleatoire
        System.out.printf("\nNombre Aleatoir\n");
        NombreAleatoire.nombreAlea();

        //Nombre des mots dans une phrase
        System.out.printf("\nNombre de mot\n");
        NombreDeMot.nombreDesMots("Bonjour Yaya, tu vas bien ?");

        //Sauvegarder Phrase
        System.out.printf("\nSauvegarder une Phrase\n");
        SauvegarderPhrase.sauvegarde();

        //Lire du texte dans un fichier et compter le nombre de mots contenu
        System.out.printf("\ncompter le nombre de mots dans un fichier\n");
        NombreMotDansFichier.compteMotDansFichier(args);

        //SommeNombre
        System.out.printf("\nSomme de nombre\n");
       SommeDe1000.somme();
    }
}