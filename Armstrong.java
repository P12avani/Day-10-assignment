/*Scenario:
A number puzzle app checks if a number is an Armstrong number.

Sample Input:
153

Sample Output:
Armstrong Number

Test Cases:

testcase-1
Input: 370
Output: Armstrong Number

testcase-2
Input: 371
Output: Armstrong Number

testcase-3
Input: 123
Output: Not Armstrong*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int originalNumber = number;  // keep the number safe for comparison
        int sum = 0;                  // to store sum of cubes
     // Loop to find sum of cubes of digits
        while (number > 0) {
            int digit = number % 10;                // extract last digit
            sum = sum + (digit * digit * digit);    // add cube of digit
            number = number / 10;                   // remove last digit
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

        scanner.close();
		}
		

	}


