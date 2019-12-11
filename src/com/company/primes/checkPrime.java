package com.company.primes;

public class checkPrime {
    public static void main(String[] args) {
        boolean prime = checkIfPrime(1103);
        System.out.println("Is the given number prime? " + prime);
    }

    static boolean checkIfPrime(int num){
        int count = 0;

        for(int i =2; i <= num/2; i++) {
            count++;
            if (num % i == 0) {
                System.out.println("the program executed: " + count + " times.");
                return false;
            }

        }
        System.out.println("the program is being executed: " + count + "times.");
        return true;
    }

    
}
