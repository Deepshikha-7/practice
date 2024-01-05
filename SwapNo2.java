package practice;

public class SwapNo2 {
	static int a=10;
	static int b=20;
	
	public static void swapping1() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping :");
		System.out.println("a="+a+" b="+b);
	}
	public static void swapping2() {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping :");
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {	
	System.out.println("before swapping :");
	System.out.println("a="+a+" b="+b);
	//swapping1();
	swapping2();
	
	}
}
