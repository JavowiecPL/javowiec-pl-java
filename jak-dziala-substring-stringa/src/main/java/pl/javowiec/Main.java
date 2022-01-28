package pl.javowiec;

public class Main {

    public static void main(String[] args) {
        // Tworzenie łańucha znaków z tablicy znaków
        char[] characters = {'j', 'a', 'v', 'o', 'w', 'i', 'e', 'c', '.', 'p', 'l'};
        String javowiecpl1 = new String(characters);
        System.out.println("String from array of chars: " + javowiecpl1);

        // Ten zapis daje taki sam rezultat
        String javowiecpl2 = "javowiec.pl";
        System.out.println("String: " + javowiecpl2);

        // Substring z jednym parametrem
        System.out.println("\"agrest\".substring(2): " + "agrest".substring(2));
        System.out.println("\"kultura\".substring(3): " + "kultura".substring(3));
        System.out.println("\"javowiec.pl\".substring(9): " + "javowiec.pl".substring(9));

        // Substring z dwoma parametrami
        System.out.println("\"monitor\".substring(4, 7): " + "monitor".substring(4, 7));
        System.out.println("\"programowanie\".substring(3, 7): " + "programowanie".substring(3, 7));
        System.out.println("\"javowiec.pl\".substring(0, 8): " + "javowiec.pl".substring(0, 8));

        // Wyjątek StringIndexOutOfBoundsException
        "javowiec.pl".substring(9, 12);
    }

}
