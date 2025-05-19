package org.bytes.study.basics;

public class ExtractionOfDigits {
    public static void main(String[] args) {
        int num = 8972;
        int ones = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;

        ones = num % 10;
        num = num/10;
        tens = num%10;
        num = num/10;
        hundreds = num%10;
        num = num/10;
        thousands = num%10;
        num = num/10;
        System.out.println(ones+ " "+tens+" "+hundreds+" "+thousands);
    }
}
