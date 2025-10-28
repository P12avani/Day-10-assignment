/*scenario:
A mobile app checks how many digits are in the entered PIN.

Sample Input:
78956
Sample Output:
5
Test Cases:
testcase-1
Input: 1234
Output: 4

testcase-2
Input: 9
Output: 1

testcase-3
Input: 100000
Output: 6*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class PinDigit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int pin=scanner.nextInt();
		 // to store number of digits
		int count=0;

        // Loop to count digits
        while (pin > 0) {
            pin = pin / 10;  // removes the last digit
            count++;         // increases count by 1
        }

        System.out.println(count); // print total number of digits
        scanner.close();

	}

}
