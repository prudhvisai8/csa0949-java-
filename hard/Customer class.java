class Customer {
    private int balance;
    private String accName;
    private int accountNo;

    public Customer(int balance, String accName, int accountNo) {
        this.balance = balance;
        this.accName = accName;
        this.accountNo = accountNo;
    }

    public synchronized void deposit(int amount) {
        System.out.println("Depositing " + amount + "...");
        balance += amount;
        System.out.println("Deposit completed. Current balance: " + balance);
        notify();  // Notify the waiting thread after deposit
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Attempting to withdraw " + amount + "...");
        while (balance < amount) {
            System.out.println("Insufficient balance, waiting for deposit...");
            try {
                wait();  // Wait if balance is not sufficient
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class BankThreadDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(10000, "Ravi", 103);

        // Creating withdraw thread
        Thread t1 = new Thread(() -> {
            customer.withdraw(12000);  // Withdraw more than balance
        });

        // Creating deposit thread
        Thread t2 = new Thread(() -> {
            customer.deposit(3000);  // Deposit amount to complete the withdrawal
        });

        t1.start();
        t2.start();
    }
}
