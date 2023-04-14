package package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SauvegarderPhrase {

    public static void sauvegarde() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisie votre phrase : ");
        String phrase = scanner.nextLine();

        File fichier = new File("fichier.txt");
        FileWriter writer = new FileWriter(fichier);
        writer.write(phrase);
        writer.close();
        System.out.println("La phrase a été sauvegardée dans le fichier " + fichier.getName() );


    }
}

