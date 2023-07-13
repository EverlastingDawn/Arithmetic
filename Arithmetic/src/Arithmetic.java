import java.util.Scanner;
public class Arithmetic {
    private int num1;
    private int num2;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int product() {
        return num1 * num2;
    }

    public int max() {
        int result = Math.max(num1, num2);
        return result;
    }

    public int min() {
        int result = Math.min(num1, num2);
        return result;
    }

    public String toString() {
        String result = "Arithmetic: " + num1 + " + " + num2 + " = " + sum() + "\n" + num1 + " * " + num2 + " = " + product() + "\n" + "max(" + num1 + ", " + num2 + ") = " + max() + "\n" + "min(" + num1 + ", " + num2 + ") = " + min();
        return result;
    }
}
