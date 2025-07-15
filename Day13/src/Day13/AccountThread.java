package Day13;

public class AccountThread extends Thread {

    private Account acc;
    private int amt;

    // Parameterized constructor
    public AccountThread(Account acc, int amt) {
        super();  // Call to Thread constructor (optional)
        this.acc = acc;
        this.amt = amt;
        start();  // Start the thread
    }

    @Override
    public void run() {
        try {
            acc.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.err.println(Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }
}
