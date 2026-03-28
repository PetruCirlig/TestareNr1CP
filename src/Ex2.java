import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        double numar1 = scanner.nextDouble();

        System.out.print("Introdu al doilea numar: ");
        double numar2 = scanner.nextDouble();

        double produs = numar1 * numar2;

        System.out.println("Produsul este: " + produs);

        scanner.close();
    }
}
