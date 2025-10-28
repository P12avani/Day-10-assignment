/*A mirror app reverses any number entered by the user.
Sample Input:
1234
Sample Output:
4321
Test Cases:
---------------
testcase-1
Input: 9876
Output: 6789
testcase-2
Input: 120
Output: 21
testcase-3
Input: 1001
Output: 1001*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int reversed = 0; // to store reversed number

        while (number > 0) {
            int lastDigit = number % 10;           // get last digit
            reversed = reversed * 10 + lastDigit;  // add it to reversed
            number = number / 10;                  // remove last digit
        }

        System.out.println(reversed);
        scanner.close();

	}

}
