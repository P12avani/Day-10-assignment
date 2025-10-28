/*A payment app calculates a checksum by summing digits of a transaction ID.

Sample Input:
1234
Sample Output:
10

Test Cases:
testcase-1
Input: 987
Output: 24

testcase-2
Input: 56
Output: 11

testcase-3
Input: 1005
Output: 6*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class SummingDigit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int transactionId=scanner.nextInt();
		int sum=0;//variable to store sum of digit
		while(transactionId>0) {
			int lastDigit=transactionId%10;
			sum=sum+lastDigit;
			transactionId=transactionId/10;
		}
         System.out.println(sum);
         scanner.close();
	}

}
