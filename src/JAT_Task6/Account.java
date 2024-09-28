package JAT_Task6;

public class Account {
	
	// Data members
    private long accountNumber;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = 1234567890l;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("The amount Withdrew from account "+accountNumber+ " is " + amount + " and the remaining balance is " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("For the account "+accountNumber+" Deposited amount is " + amount + " and New balance is " + balance );
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Getter for account number (optional)
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number (optional)
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public static void main(String[] args) {
		Account acc1=new Account();
		System.out.println("The current balance of account "+ acc1.accountNumber+" is "+ acc1.checkBalance());
		acc1.deposit(1000);
		acc1.withdraw(100);
		System.out.println("The current balance of account "+ acc1.accountNumber+" is "+ acc1.checkBalance());
		
		Account acc2=new Account(2345678901l,2000);
		System.out.println("The current balance of account "+ acc2.accountNumber+" is "+ acc2.checkBalance());
		acc2.deposit(1000);
		acc2.withdraw(100);
		System.out.println("The current balance of account "+ acc2.accountNumber+" is "+ acc2.checkBalance());
	}

}
