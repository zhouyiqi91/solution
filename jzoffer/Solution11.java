package jzoffer;

public class Solution11 {
    public static double Power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent > 0) return result;
        return 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,-3));
    }
}
