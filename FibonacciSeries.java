/*A biology simulator models growth patterns using Fibonacci numbers.

Sample Input:
7
Sample Output:
0 1 1 2 3 5 8

Test Cases:

testcase-1
Input: 5
Output: 0 1 1 2 3

testcase-2
Input: 8
Output: 0 1 1 2 3 5 8 13

testcase-3
Input: 10
Output: 0 1 1 2 3 5 8 13 21 34*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();

        int a = 0, b = 1;

        // Print first two numbers manually if n > 0
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();

	}

}
