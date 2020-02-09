package com.company.prime;

public class Main {
    public static void main(String[] args) {

        checkPrime();
        primeWithOdd();
        simplePrime();
        squareRootPrime();
    }

    public static void checkPrime(){
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

    public static void primeWithOdd() {

        int num = 1103;
        boolean isPrime = true;
        int count = 0;

        for(int i = 3; i < num/2; i+=2){
            if(num % i == 0){
                isPrime =false;
            }
            count++;
        }
        System.out.println("the program is being executed " + count + " times.");
        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void simplePrime() {
        int num = 1103;
        boolean isPrime = true;
        int count = 0;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
            }
            count++;
        }
        System.out.println("The program is being executed " + count + " times.");

        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void squareRootPrime() {
        int num = 1103;
        boolean isPrime = true;
        int count = 0;

        for(int i = 3; i < Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
            count++;
        }
        System.out.println("The program is being executed " + count + " times.");

        if(isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        System.out.println("Anusha");
    }
}
