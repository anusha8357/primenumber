package com.company.prime.primes;

public class checkPrime {
    public static void main(String[] args) {
        checkIfPrime();
        //boolean isItPrime = isPrime(...);
        //System.out.println("Is the given number is prime: " + isItPrime);
    }
    
    /*
    private static boolean checkIfPrime(int/long....){
    .....
    }
    */
    private static void checkIfPrime(){
        int num = 1103;
        int count = 0;
        boolean isPrime = true;

        for(int i =2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
            count++;

        }
        System.out.println("the number of time that the program is being executed: " + count);

        if(isPrime){
            System.out.println( num + " is a prime number.");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }
}
