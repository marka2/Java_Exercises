import java.*;
import java.util.Arrays;
import java.util.Scanner;

public class arrayLargestNumber{

	public static void main(String[] args) {

		int number_of_ints = Integer.parseInt(args[0]);

		int[] myArray = new int[number_of_ints];

		System.out.println("This program will display the largest number in " + args[0] + " integers that you enter into the console.\n");

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter in " + args[0] + " integers: ");
		
		for (int i = 0; i < number_of_ints; i++) {

			myArray[i] = myScanner.nextInt();	
		
		}
				
		int greatest_value = myArray[0];
		
		for (int i = 0; i < myArray.length; i++) {
			if (!(i == (myArray.length - 1))) {
				if (greatest_value < myArray[i]) {
					greatest_value = myArray[i];
				}
			}
		}

                if ( myArray[myArray.length - 1] > greatest_value) {
                             greatest_value = myArray[myArray.length - 1];
                }
	
		System.out.println("The greatest value in the array is: " + greatest_value + "!");
	}

}
