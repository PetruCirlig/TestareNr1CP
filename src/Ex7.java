import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        if (numar % 4 == 0) {
            System.out.println("Numarul este par.");
        } else {
            System.out.println("Numarul este impar.");
        }

        scanner.close();
    }
}
