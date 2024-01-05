package practice;

public class MyPalindrom {

	public static void main(String[] args) {
		int no=234;
		int rev=0;
		int temp=no;
		System.out.println("the number is : "+no);
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("after palindrom formula : "+rev);
		if(no==temp) {
			System.out.println("so, number is palindrom");
		}
		else {
			System.out.println("so, number is not palindrom");
		}
	}

}
