package org.bytes.study.basics;

import static java.lang.Math.log10;
// O(log10(n))
// since, n is getting divided by 10
public class CountNofDigits {
    public static void main(String[] args) {
        int n = 348574304;
        System.out.println(countNoOfDigits1(n));
        System.out.println(countNoOfDigits2(n));
    }

    private static int countNoOfDigits2(int n) {
        if (n == 0) return 1;
        return (int)(log10(n)+1);
    }

    private static int countNoOfDigits1(int n) {
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
    return count;}
}
