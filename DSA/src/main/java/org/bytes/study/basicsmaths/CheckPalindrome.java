package org.bytes.study.basics;

public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(checkPalindrome(num));
    }

    private static boolean checkPalindrome(int num) {
    int n = num;
    int revNum = 0;
    while(n >0){
        revNum = revNum*10+n%10;
        n = n/10;
    }
        return revNum == num;
    }
}
