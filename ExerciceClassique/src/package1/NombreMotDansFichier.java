package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NombreMotDansFichier {

    public static void compteMotDansFichier(String[] args) {

        if (args.length < 1) {
            System.out.println("Entrer le chemin du fichier sur le console");
            return;
        }

        String chemin = args[0];

        try {
            File fichier = new File(chemin);
            Scanner lecteur = new Scanner(fichier);
            int nombreDeMots = 0;
            while (lecteur.hasNext()) {
                lecteur.next();
                nombreDeMots++;
            }
            lecteur.close();
            System.out.println("Le fichier " + fichier.getName() + " contient " + nombreDeMots + " mots.");
        } catch (FileNotFoundException e) {
            System.out.println("le fichier ou le chemin n'existe pas : " + e.getMessage());
        }
    }

}