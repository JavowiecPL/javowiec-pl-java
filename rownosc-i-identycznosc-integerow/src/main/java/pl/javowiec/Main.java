package pl.javowiec;

public class Main {

    public static void main(String[] args) {
        // To jest autoboxing
        Integer fiveAutoboxing = 5;

        // Autoboxing w rzeczywistości wywołuje poniższą metodę
        Integer fiveStaticFactoryMethod = Integer.valueOf(5);

        Integer a = 20;
        Integer b = 20;
        System.out.println("Czy a i b są równe: " + a.equals(b));
        System.out.println("Czy a i b są identyczne: " + (a == b));

        Integer c = 200;
        Integer d = 200;
        System.out.println("Czy c i d są równe: " + c.equals(d));
        System.out.println("Czy c i d są identyczne: " + (c == d));
    }

}
