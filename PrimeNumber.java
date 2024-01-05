package practice;
// printing prime numbers

//import java.util.Scanner;

public class PrimeNumber {
	  
	public static void main(String[] args) {
		// to check weather a number is prime 
	/*System.out.println("enter a number to check if it is a prime number !");
	Scanner s=new Scanner(System.in);
	  int no=s.nextInt();
	  int count=0;
		for(int i=2;i<no;i++) {
				if(no%i==0) {
					count++;
				}
			}
		if(count>1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime no ");
		}*/
		
	
		/* int i,j;
		for( i=1;i<=100;i++) {
			int temp=0;
			for( j=i;j>=1;j--) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==2) {
				System.out.print(" "+i);
			}
		} */
		 
		int i, j;
		int find = 100;

		if (find < 2)
			System.out.println("Not a prime number");

		for (i = 2; i <= find; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j == i) {
				System.out.print(i + ",");
			}
		}
	}
}
