package jzoffer;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//
//保证base和exponent不同时为0
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
