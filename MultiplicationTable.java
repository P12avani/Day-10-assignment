/*Scenario:
A student uses a math app that helps them practice multiplication tables.
Write a program that takes a number and prints its multiplication table up to 10.

Sample Input:

5
Sample Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50


Test Cases:
testcase-1
Input: 3
Output:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30

testcase-2
Input: 7
Output:
7 x 1 = 7
...
7 x 10 = 70

testcase-3
Input: 10
Output:
10 x 1 = 10
...
10 x 10 = 100*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for( int i=1;i<=10;i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}

	}

}
