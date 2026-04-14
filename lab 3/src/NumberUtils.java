public class NumberUtils {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("Is Prime: " + isPrime(7));
        System.out.println("Reverse: " + reverseNumber(1234));
        System.out.println("Is Palindrome: " + isPalindrome(121));
        System.out.println("Sum Digits: " + sumDigits(123));
    }
}