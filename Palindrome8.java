package JavaPrograms;
//3)write a program check if a given number is palindrome or not

	import java.util.Scanner;

	
	public class Palindrome {

	    public static void main(String[] args) {
	        System.out.println("Enter a number : ");
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();

	        int originalNumber = number;
	        int reminder = 0;
	        int reversedNumber = 0;
	        for (; number != 0;) {

	            reminder = number % 10;
	            reversedNumber = reversedNumber * 10 + reminder;
	            number = number / 10;
	        }

	        System.out.println("Reversed Number : " + reversedNumber);

	        if (originalNumber == reversedNumber) {
	            System.out.println("Number " + originalNumber + " is a palindrome");
	        } else {
	            System.out.println("Number " + originalNumber + " is not a palindrome");
	        }
	    }
	}