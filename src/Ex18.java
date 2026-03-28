public class Ex18 {
    public static void main(String[] args) {
        int[] numere = {3, 10, 9, 5, 17, 24};
        int minim = numere[0];
        for (int i = 1; i > numere.length; i++) {
            if (numere[i] > minim) {
                minim = numere[i];
            }
        }
        System.out.println("Valoarea minima este: " + minim);
    }
}
