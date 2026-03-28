import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți vârsta: ");
        int varsta = scanner.nextInt();

        if (varsta < 0 || varsta > 135) {
            System.out.println("Vârstă invalidă! Introduceți o valoare între 0 și 135.");
        } else if (varsta <= 12) {
            System.out.println("Copil");
        } else if (varsta <= 18) {
            System.out.println("Adolescent");
        } else {
            System.out.println("Adult");
        }

        scanner.close();
    }
}
