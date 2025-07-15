package finallyblock;

import java.util.Scanner;

// Custom Exception for Negative Percentage
class negativeException extends Exception {
    public negativeException() {
        super("Percentage cannot be negative.");
    }
}

// Custom Exception for Percentage > 100
class greatervalueException extends Exception {
    public greatervalueException() {
        super("Percentage cannot be greater than 100.");
    }
}

public class UsingThrow {

    static int acceptNumber() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  // Avoid closing System.in in small programs; may cause issue later
        return n;
    }

    public static void main(String[] args) {
        int per;
        System.out.println("Enter your percentage: ");
        per = acceptNumber();

        try {
            if (per < 0)
                throw new negativeException();
            else if (per > 100)
                throw new greatervalueException();
            else
                System.out.println("Valid percentage: " + per);
        } catch (negativeException | greatervalueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
