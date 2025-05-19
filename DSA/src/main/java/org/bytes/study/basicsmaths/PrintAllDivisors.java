package org.bytes.study.basics;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 10;
        printAllDivisors(n);
        System.out.println();
        n = 10;
        printAllDivisors1(n);
        n = 36;
        System.out.println();
        printAllDivisors(n);
        System.out.println();
        n = 36;
        printAllDivisors1(n);
    }

    private static void printAllDivisors1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                System.out.print(i+ " ");
                if(n/i != i)
                    System.out.print(n/i+ " ");
            }
        }
    }

    private static void printAllDivisors(int n) {
        // O(n)
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i+ " ");
            }
        }
    }
}
