public class TypeCasting {
    public static void main(String[] args) {

        double price = 29.99;
        int newPrice = (int) price;

        System.out.println("Original double: " + price);
        System.out.println("casting  int: " + newPrice);

        int result1 = 7 / 2;
        double result2 = (double) 7 / 2;

        System.out.println("7 / 2 = " + result1);
        System.out.println("(double)7 / 2 = " + result2);

        String number = "42";
        int convertedNumber = Integer.parseInt(number);

        System.out.println("String value: " + number);
        System.out.println("Converted to int: " + convertedNumber);
    }
}