
class BankAccount {
    // Instance variables
    String accountHolderName;
    long accountNumber;
    double balance;
    boolean transaction;

    // Method to withdraw money
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            transaction = true;
            sendMessage(transaction, amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to deposit money
    public void deposit(double amt) {
        balance += amt;
        transaction = false;
        sendMessage(transaction, amt);
    }

    // Method to send a transaction message
    public void sendMessage(boolean transaction, double amt) {
        if (transaction) {
            System.out.println(amt + " has been withdrawn successfully.");
        } else {
            System.out.println(amt + " has been deposited successfully.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account details:");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of BankAccount
        BankAccount b1 = new BankAccount();
        b1.accountHolderName = "INGLE VISHAL GANESH";
        b1.accountNumber = 8459113402935605L;
        b1.balance = 50000;
        

        // Method calls
        b1.displayDetails();
        b1.deposit(1000);
        b1.withdraw(30000);
    }
}
