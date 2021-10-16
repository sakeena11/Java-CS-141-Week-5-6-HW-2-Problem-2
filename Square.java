//import java.util.Scanner;

public class Square {
    public static boolean isPerfectSquare(int n) {
        //TODO: complete this method
        System.out.println("Please enter a positive integer");
        double i = Math.sqrt(n);
        double k = Math.pow(i, 2);
        if (k == n) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}