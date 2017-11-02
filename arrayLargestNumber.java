import java.*;
import java.util.Arrays;

public class arrayLargestNumber{

	public static void main(String[] args) {
		int[] myArray = new int[15];
		int value = 1;
		int greatest_value = 0;
		
		for (int i = 0; i < 15; i++) {
			myArray[i] = i+1;
		}	
	
		for (int i = 0; i < myArray.length; i++) {
			if (!(i == (myArray.length - 1))) {
				if (myArray[i] < myArray[i+1]) {
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
