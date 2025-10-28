/*Scenario:
A cryptography app generates prime numbers up to n for key creation.

Sample Input:
10
Sample Output:
2 3 5 7

Test Cases:

testcase-1
Input: 5
Output: 2 3 5

testcase-2
Input: 15
Output: 2 3 5 7 11 13

testcase-3
Input: 20
Output: 2 3 5 7 11 13 17 19*/


package com.codegnan.contolstatements;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt(); // Read input number

        // Loop through numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if 'i' is prime
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
	}

}
