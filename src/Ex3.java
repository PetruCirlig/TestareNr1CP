import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        double a = scanner.nextDouble();

        System.out.print("Introdu al doilea numar: ");
        double b = scanner.nextDouble();

        double adunare = a + b;
        double scadere = a - b;
        double inmultire = a * b;

        System.out.println("Adunare: " + adunare);
        System.out.println("Scadere: " + scadere);
        System.out.println("Inmultire: " + inmultire);

        if (b != 0) {
            double impartire = a / b;
            double rest = a % b;

            System.out.println("Impartire: " + impartire);
            System.out.println("Restul impartirii: " + rest);
        } else {
            System.out.println("Impartirea la 0 nu este permisa.");
        }

        scanner.close();
    }
}
