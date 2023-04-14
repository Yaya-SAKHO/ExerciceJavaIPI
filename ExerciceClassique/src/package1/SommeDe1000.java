package package1;

public class SommeDe1000 {

    public static void somme() {
        int somme = 0;
        for (int i = 1; i <= 1000; i++) {
            somme += i;
        }
        System.out.println("La somme des 1000 est : " + somme);
    }
}
