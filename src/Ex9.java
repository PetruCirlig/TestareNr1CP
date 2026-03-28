public class Ex9 {
    public static void main(String[] args) {
        int luna = Integer.parseInt(args[0]);
        String anotimp;

        switch (luna) {
            case 12, 1, 2 -> anotimp = "iarna";
            case 3, 4, 5 -> anotimp = "primavara";
            case 6, 7, 8 -> anotimp = "vara";
            case 9, 10, 11 -> anotimp = "toamna";
            default -> anotimp = "Luna invalida";
        }

        System.out.println(anotimp);

    }
}
