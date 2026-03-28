public class DayName {
    public static void main(String[] args) {

        for (int day = 1; day <= 8; day++) {

            String result = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6, 7 -> "Weekend";
                default -> "Invalid";
            };
            System.out.println("Day " + day + " -> " + result);
        }
    }
}