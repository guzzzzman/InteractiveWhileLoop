// Jose Guzman
// October 1, 2023
// Description: A program that finds the smallest, largest, sum, and average.
// File name: InteractiveWhileLoop.java
// To Compile in terminal type: javac InteractiveWhileLoop.java
// To Run in terminal type: java InteractiveWhileLoop

import java.util.Scanner;

public class InteractiveWhileLoop {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;

		System.out.println("Enter numbers:");

		while (true) {
			number = scanner.nextInt();

			if (number == 0){
				break;
			}

			if(number < smallest) {
				smallest = number;
			}

			if (number > largest){
				largest = number;
			}

			sum += number;
			count++;
		}

		if (count == 0) {
			System.out.print("Enter a valid number.");
		} else {
			double average = (double) sum / count; 

			System.out.println("Smallest number: " + smallest);
			System.out.println("Largest number: " + largest);
			System.out.println("Sum of numbers: " + sum);
			System.out.println("Average of numbers: " + average);
		}
		scanner.close();
	}
}

/*
Enter numbers:
12
13
14
0
Smallest number: 12
Largest number: 14
Sum of numbers: 39
Average of numbers: 13.0
*/