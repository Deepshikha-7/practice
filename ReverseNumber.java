package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int no=547;
		int rev=0;
		System.out.println("before reversing : "+no);
		while(no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("after reversing the number :"+rev);
	}
}
