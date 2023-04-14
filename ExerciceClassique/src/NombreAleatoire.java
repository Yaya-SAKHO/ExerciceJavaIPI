import java.util.Random;
import java.util.Scanner;

public class NombreAleatoire{

    public static void nombreAlea(){

        Random rand = new Random();
        int nombre = rand.nextInt(5) + 1;
        Scanner scanner = new Scanner(System.in);
        int valEntree;
        int nombreCoups = 0;

        String reponse = "N";
        do {
            System.out.print("Nombre entre 1 et 5 : ");
            valEntree = scanner.nextInt();
            nombreCoups++;
            if (valEntree < nombre) {
                System.out.println("Nombre saisie est plus petit !");
            } else if (valEntree > nombre) {
                System.out.println("Nombre saisie est Plus grand !");
            }
        }
        while(valEntree !=nombre);

        System.out.println("Trouvé, Bravo, le nombre de coups est " + nombreCoups );
    }

}