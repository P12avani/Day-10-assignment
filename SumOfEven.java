/*scenario:
An analytics app finds the total of even and odd numbers up to a limit n.

Sample Input:
10


Sample Output:
Sum of even numbers: 30
Sum of odd numbers: 25


Test Cases:

testcase-1
Input: 5
Output:
Sum of even numbers: 6
Sum of odd numbers: 9

testcase-2
Input: 8
Output:
Sum of even numbers: 20
Sum of odd numbers: 16

testcase-3
Input: 3
Output:
Sum of even numbers: 2
Sum of odd numbers: 4*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		
		System.out.println("Sum of even numbers:"+evenSum);
		System.out.println("Sum of odd numbers:"+oddSum);
		scanner.close();
	}
		

	}

	


