package trycatch;

public class TrycatchDemo {
    public static void main(String[] args) {

        TryCatchExample.performDivision(12, 2);
        TryCatchExample.performDivision(100, 10);
        TryCatchExample.performDivision(112, 2);
        TryCatchExample.performDivision(1000, 0);  // This will be caught
        TryCatchExample.performDivision(122, 12);
    }
}
