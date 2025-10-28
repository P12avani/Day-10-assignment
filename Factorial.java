/*Scenario:
A calculator app computes factorials for permutation formulas.
Sample Input:
5
Sample Output:
120
Test Cases:
testcase-1
Input: 3
Output: 6

testcase-2
Input: 6
Output: 720

testcase-3
Input: 0
Output: 1*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();//user input
		int factorial=1;//start with 1
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;//multiply each number
		}
      System.out.println(factorial);//print factorial
      scanner.close();
	}

}
