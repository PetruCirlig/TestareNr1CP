import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu ora (0-23): ");
        int ora = scanner.nextInt();

        if (ora >= 0 && ora < 6) {
            System.out.println("Este noapte");
        } else if (ora >= 6 && ora < 12) {
            System.out.println("Este dimineață");
        } else if (ora >= 12 && ora < 18) {
            System.out.println("Este după-amiază");
        } else if (ora >= 18 && ora < 22) {
            System.out.println("Este seară");
        } else if (ora >= 22 && ora <= 23) {
            System.out.println("Este noapte");
        } else {
            System.out.println("Ora introdusă nu este validă");
        }

        scanner.close();
    }
}
