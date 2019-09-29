package jzoffer;

//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
public class Solution09 {
    public static int Fibonacci(int n) {
        int fibMinus1 = 1;
        int fibMinus2 = 0;
        int fibN = 0;  //局部变量需要初始化
        if (n<0) return 0;
        if (n==0) return 0;
        if (n==1) return 1;
        for (int i=2;i<=n;i++){
            fibN = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibN;
        }
        return fibN;
    }

    public static int FibRecur(int n) {
        int fibMinus1 = 1;
        int fibMinus2 = 0;
        int fibN = 0;  //局部变量需要初始化
        if (n<0) return 0;
        if (n==0) return 0;
        if (n==1) return 1;
        for (int i=2;i<=n;i++){
            fibN = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibN;
        }
        return fibN;
    }

}
