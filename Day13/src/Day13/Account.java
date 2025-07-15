package Day13;

public class Account {
    private int balance = 1000;

    public synchronized void withdraw(int amt) throws InsufficientBalanceException {
        if (amt > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + balance + ", Requested: " + amt);
        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawing: " + amt);
            balance -= amt;
            System.out.println("Balance left: " + balance);
        }
    }
}
