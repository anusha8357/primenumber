package com.company.primes;

public class squareRootPrime {
    public static void main(String[] args) {
        boolean isPrime = squareRootsPrime(1103);
        System.out.println("Is the given number prime? " + isPrime);
    }

    static boolean squareRootsPrime(int num) {

        int count = 0;

        for(int i = 3; i < Math.sqrt(num); i++){  //conside changing to step = 2
            count++;
            if(num % i == 0){
                System.out.println("The program is being executed " + count + " times.");
                return false;
            }

        }
        System.out.println("The program is being executed " + count + " times.");
        return true;
    }
}
