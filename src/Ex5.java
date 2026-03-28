import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introdu parola: ");
                String parola = scanner.nextLine();

                String parolaAscunsa = "";
                for (int i = 0; i < parola.length(); i++) {
                    parolaAscunsa += "0101";
                }

                System.out.println("Parola ta (Ascunsa): " + parolaAscunsa);

                scanner.close();
    }
}
