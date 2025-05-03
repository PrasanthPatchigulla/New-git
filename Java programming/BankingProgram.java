import java.util.*;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;  
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("**********************");
            System.out.println(" BANKING PROGRAM ");
            System.out.println("1. See balance ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Deposit ");
            System.out.println("4. Exit ");
            System.out.println("**********************");

            System.out.println("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = withdraw(balance);
                case 3 -> balance += deposit();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid input.");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.printf("Your balance: $%.2f\n", balance);
    }

    static double withdraw(double balance) {
        System.out.println("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return balance;  
        } else if (amount < 0) {
            System.out.println("Amount can't be negative.");
            return balance;  
        } else {
            return balance - amount;
        }
    }

    static double deposit() {
        System.out.println("Enter the amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Deposit amount can't be negative.");
            return 0;
        } else {
            return amount;
        }
    }
}
