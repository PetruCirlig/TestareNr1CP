import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea numar: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Numarul mai mare este: " + a);
            System.out.println("Numarul mai mic este: " + b);
        } else if (a < b) {
            System.out.println("Numarul mai mare este: " + b);
            System.out.println("Numarul mai mic este: " + a);
        } else {
            System.out.println("Numerele sunt egale.");
        }

        scanner.close();

    }
}
