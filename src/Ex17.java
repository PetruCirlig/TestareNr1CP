public class Ex17 {
    public static void main(String[] args) {
        int[] numere = {3, 10, 9, 5, 17, 24};
        int maxim = numere[0];
        for (int i = 1; i < numere.length; i++) {
            if (numere[i] > maxim) {
                maxim = numere[i];
            }
        }
        System.out.println("Valoarea maxima este: " + maxim);
    }
}
