package org.bytes.study.basics;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 349857;
        System.out.println(reverse(n));
        n = 349857000;
        System.out.println(reverse(n));
        n = 123456789;
        System.out.println(reverse(n));

        n = 349857;
        System.out.println(reverse1(n));
        n = 349857000;
        System.out.println(reverse1(n));
        n = 123456789;
        System.out.println(reverse1(n));
    }

    private static int reverse1(int n) {
        int num = 0;
        while(n>0){
            num = num*10+n%10;
            n=n/10;
        }
    return num;
    }

    private static int reverse(int n) {
        String num = "";
        while(n>0){
            num = num+n%10;
            n=n/10;
        }
    return Integer.parseInt(num);
    }
}
