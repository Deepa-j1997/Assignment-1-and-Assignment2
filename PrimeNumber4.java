package JavaPrograms;
import java.util.Scanner;

/**
 *4) Java Program to print all prime numbers between 10 to 99
 */
public class PrimeNumber {
 
    public static void main(String[] args) {
        int i, j, isPrime, n;
        System.out.println("All Prime Numbers Between 10 to 99");
 
        // For every number between 2 to 100, check
        //  whether it is prime number or not
        for (i = 10; i <= 99; i++) {
            isPrime = 0;
            // Check whether i is prime or not
            for (j = 2; j <= i / 2; j++) {
                // If any number between 2 to i/2 divides i
                // completely then i cannot be prime number
                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
 
            if (isPrime == 0)
                System.out.print(i + " ");
        }
 
    }
}



