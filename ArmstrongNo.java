package practice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.println(" enter a no to check armstromg ");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int no1=no;
		int len=0;
		while(no1!=0) {
			len=len+1;
			no1=no1/10;
		}
		System.out.println("length is : "+len);
		int rem;int res=0;int p;
		while(no!=0) {
			rem=no%10;
			p=(int) Math.pow(rem,len);
			res=res+p;
			no=no/10;
			System.out.println(res);
			}
		System.out.println("after armstromg formula value is : " +res);

			if(res==no) {
				System.out.println("its an armstrong number");
			}
			else
				System.out.println("so, number is not armstrong");
		} 
		
	/*	int no=124;
		int temp=no;
		int length=0;
		// get the length
		while(temp!=0) {
			length=length+1;
			temp=temp/10;
		}
		// apply the logic
		int temp2=no;
		int arm=0;
		int rem;
		while(temp2!=0) {
			rem=temp2%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			arm=arm+mul; 
			temp2=temp2/10;
		}
		if(arm==no) {
			System.out.println(no+" is armstrong");
		}
		else {
			System.out.println(no+" is not armstrong");
		} 
	} */
}
