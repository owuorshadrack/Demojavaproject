// Shadrack Omomdi
// CT101/G/21120/23
// Base class BankAccount
public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
        }
    }
}

// Subclass CheckingAccount
public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double transactionFee = 1.0;
        if (balance - (amount + transactionFee) >= 0) {
            balance -= (amount + transactionFee);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
        }
    }
}

// Testing the classes
public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500);
        BankAccount checking = new CheckingAccount(500);

        System.out.println("Savings Account Initial Balance: $" + savings.getBalance());
        savings.withdraw(450);
        System.out.println("Savings Account Balance after Withdrawal: $" + savings.getBalance());

        System.out.println("Checking Account Initial Balance: $" + checking.getBalance());
        checking.withdraw(450);
        System.out.println("Checking Account Balance after Withdrawal: $" + checking.getBalance());
    }
}
