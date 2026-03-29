import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apasa o litera de la claviatura care indica (R, G, V): ");
        String input = scanner.nextLine().toUpperCase();
        switch (input) {
            case "R":
                System.out.println("Rosu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            case "V":
                System.out.println("Verde");
                break;
            default:
                System.out.println("Aveti doar 3 optiuni: r, g, v");
        }

        scanner.close();
    }
}
