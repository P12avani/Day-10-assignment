/*A number game rewards players if the entered number reads the same forward and backward.

Sample Input:
121
Sample Output:
Palindrome
Test Cases:

testcase-1
Input: 1221
Output: Palindrome

testcase-2
Input: 123
Output: Not Palindrome

testcase-3
Input: 101
Output: Palindrome*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();

        int originalNumber = number;  // store original number for comparison
        int reversed = 0;             // to store reversed number

        // Step 1: Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;            // get last digit
            reversed = reversed * 10 + lastDigit;   // build reversed number
            number = number / 10;                   // remove last digit
        }

        // Step 2: Compare original and reversed
        if (originalNumber == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();

	}

}
