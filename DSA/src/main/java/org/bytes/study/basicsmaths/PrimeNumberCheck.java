package org.bytes.study.basics;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        for(int i = 2; i<100;i++)
            primeNumberCheck(i);
        System.out.println();
        for(int i = 2; i<100;i++)
            primeNumberCheck1(i);
    }

    private static void primeNumberCheck1(int n) {
        // all the factors can be found in sqrt of n
        int count = 0;
        for (int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0) {
                count++;
                if(n/i != i)
                    count++;
            }
        }
        if(count<=2)
            System.out.print(n+" ");

    }

    private static boolean primeNumberCheck(int n) {
        for(int i = 2; i<=n/2;i++){
            if(n%i == 0)
                return false;
        }
        System.out.print(n+" ");
        return true;
    }
}
