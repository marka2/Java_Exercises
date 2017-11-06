/*
*     Author: Mark Arakaki
*     Date: November 6, 2017
*
*     Write an efficient program for printing k largest elements in an array. Elements in an array can be in any order
*
*     For example, if given array is [1, 24, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements i.e., k = 3 then your program should print out 50, 30, 23
*/
import java.util.*;
import java.io.*;

public class largestElements {

      public static void main(String[] args) {

            int[] myArray = {1, 24, 12, 9, 30, 2, 50};

            int k = 0;

            Scanner myScanner = new Scanner(System.in);

            System.out.println("Please enter the k largest elements that you want in the array: ");

            k = myScanner.nextInt();

            System.out.println(Arrays.toString(myArray));
            
            int n = myArray.length;
            if (!(k == 0)) {
             
            for (int i = 0; i < n - 1; i++) {               // bubble sort
                  for (int r = 0; r < n - i - 1; r++) {
                        if (myArray[r] > myArray[r+1]) {
                              int temp = myArray[r];
                              myArray[r] = myArray[r+1];
                              myArray[r+1] = temp;
                        }
                  }
            }


            int base = (myArray.length - k);

            while (base != (myArray.length - 1)) {
                  System.out.print(myArray[base] + " ");
                  base++;
            }

            System.out.println(myArray[base]);
            }
            else {
                System.out.println("");
            }
      }
}
