public class NombreDeMot {
    public static void nombreDesMots(String chaine)
    {
        int count = 0;
        String [] nbchaine  = chaine.split(" ");
        for(String n : nbchaine) {
            count++;
        }

        System.out.printf("il y'a " + count + " mot(s) dans : " + chaine);
    }
}
