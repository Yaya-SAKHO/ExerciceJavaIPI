public class Main {
    public static void main(String[] args) {

        //Renverser une chaîne de caractères
        String chaine = "Bonjour";
        String renverseChaine = RenverserChaine.renverserChaine(chaine);
        System.out.printf("Chaine: " + chaine);
        System.out.printf("\nChaine renverser: " + renverseChaine);

        
        //Nombre Aleatoire
        System.out.printf("\nNombre Aleatoir\n");
        NombreAleatoire.nombreAlea();

        //Nombre des mots dans une phrase
        System.out.printf("\nNombre de mot\n");
        NombreDeMot.nombreDesMots("Bonjour Yaya, tu vas bien ?");
    }
}