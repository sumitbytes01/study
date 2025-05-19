package org.bytes.study.basics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(checkArmstrongNum(num));
        num = 371;
        System.out.println(checkArmstrongNum(num));
    }

    private static boolean checkArmstrongNum(int num) {
        int n = num;
        int sum = 0;
        while(num>0){
            sum = (int) (sum + Math.pow(num%10, 3));
            num = num/10;
        }
    return sum == n;
    }
}
