import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\n1- Check Balance");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);

            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = input.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited successfully");
                } else {
                    System.out.println("Invalid amount!");
                }

            } else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amount = input.nextDouble();

                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdraw successful");
                } else {
                    System.out.println("Invalid or insufficient balance!");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}