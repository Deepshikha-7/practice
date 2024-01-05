package practice;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		System.out.println("enter how many numbers you want sum :");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum= (no*(no+1)/2); // optimal approach 
		
//		for(int i=1;i<=no;i++) {		
//			sum=sum+i;
//		}
		
		System.out.println("sum of first "+no+" numbers = " +sum);
	}

}
