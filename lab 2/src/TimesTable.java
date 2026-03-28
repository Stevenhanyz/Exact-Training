public class TimesTable {
    public static void main(String[] args) {

        System.out.println("    1   2   3   4   5");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d | ", i);

            for (int j = 1; j <= 5; j++) {
                System.out.printf("%-3d ", i * j);
            }
            System.out.println();
        }
    }
}