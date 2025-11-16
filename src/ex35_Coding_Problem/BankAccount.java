package ex35_Coding_Problem;

public class BankAccount {

        // Private balance field
        private double balance;

        // Constructor to initialize balance
        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance cannot be negative. Setting balance to Rs 0.0");
                this.balance = 0.0;
            }
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(" Balance after deposit: Rs" + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println(" Withdrawal amount must be positive.");
            } else if (amount > balance) {
                System.out.println(" Insufficient funds. Current balance: Rs" + balance);
            } else {
                balance -= amount;
                System.out.println("Balance after withdrawal: Rs" + balance);
            }
        }

        // Method to get current balance
        public double getBalance() {
            return balance;
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Creating a BankAccount with initial balance Rs1000
            BankAccount account = new BankAccount(1000);

            // Performing deposit and withdrawal
            account.deposit(500);     // Expected balance: Rs1500.0
            account.withdraw(200);    // Expected balance: Rs1300.0
        }
    }

