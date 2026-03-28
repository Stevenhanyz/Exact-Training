public class BankAccount {
    public static void main(String[] args) {

        String accountHolder = "Steven Hany";
        long accountNumber = 123456789;
        double balance = 2500.50;
        boolean isActive = true;


        System.out.printf("Account Holder: %s\n", accountHolder);
        System.out.printf("Account Number: %d\n", accountNumber);
        System.out.printf("Balance: %.2f\n", balance);
        System.out.printf("Account Active: %b\n", isActive);
    }
}